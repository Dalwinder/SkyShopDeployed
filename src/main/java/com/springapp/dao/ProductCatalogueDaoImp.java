package com.springapp.dao;

import com.heroku.sdk.jdbc.DatabaseUrl;
import com.springapp.model.Product;
import com.springapp.model.ProductImpl;
import com.springapp.model.Supplier;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductCatalogueDaoImp implements ProductCatalogueDao {

	public Product insertProduct(ProductImpl product){
		Connection connection = null;
		try {
			connection = DatabaseUrl.extract().getConnection();
			Statement stmt = connection.createStatement();
			SuppliersDaoImp suppliersDaoImp = new SuppliersDaoImp();
			String suppliers  = "";
			List<Supplier> supplierList = product.getProductSuppliers();
			int supplierLength =  supplierList.size();
			for(int i = 0; i < supplierLength; i++){
				int supplierId = supplierList.get(i).getSupplierId();
				suppliers += Integer.toString(supplierId);
			}

			String query = "INSERT INTO Products (code, name, shortDescription, longDescription, price, imageurl, rowLocation, shelfLocation, reOrderLevel, stockLevel, discontinued, suppliers)"
					+ "VALUES ('"
					+ product.getProductCode() + "', '"
					+ product.getName() + "', '"
					+ product.getShortDescription() + "', "
					+ product.getLongDescription() + "', "
					+ product.getPrice()  + ", '"
					+ product.getImageUrl()  + "', '"
					+ product.getRowLocation()  + "', '"
					+ product.getShelfLocation()  + "', '"
					+ product.getReorderLevel()  + "', '"
					+ product.getStockLevel()  + "', "
					+ product.isDiscontinued() + "', "
					+ suppliers + ")";
			stmt.executeQuery(query);
		} catch (Exception e){

		}
		finally {
			if (connection != null) try{connection.close();} catch(SQLException e){}
		}

		return product;
	}

	public void updateProduct(ProductImpl product){
		Connection connection = null;
		try {
			connection = DatabaseUrl.extract().getConnection();
			Statement stmt = connection.createStatement();
			ArrayList<Supplier> suppliers = new ArrayList<Supplier>();

			String suppliersStr = "";
			int length = product.getProductSuppliers().size();
			List<Supplier> supplierArray = product.getProductSuppliers();

			for(int i= 0; i < length; i++){
				suppliersStr += supplierArray.get(i).getSupplierId();
			}

			String query = "UPDATE Products SET"
					+ "code ='" + product.getProductCode() + "', '"
					+ "name ='"  + product.getName() + "', '"
					+ "shortDescription ='" + product.getShortDescription() + "', "
					+ "longDescription ='" + product.getLongDescription() + "', "
					+ "price ='" + product.getPrice()  + ", '"
					+ "imageurl ='" + product.getImageUrl()  + "', '"
					+ "rowLocation ='" + product.getRowLocation()  + "', '"
					+ "shelfLocation ='" + product.getShelfLocation()  + "', '"
					+ "reOrderLevel ='" + product.getReorderLevel()  + "', '"
					+ "stockLevel ='" + product.getStockLevel()  + "', "
					+ "discountinued ='" + product.isDiscontinued()  + "', "
					+ "suppliers ='" + suppliersStr
					+ "WHERE id =" + product.getId();
			stmt.executeQuery(query);
		} catch (Exception e){

		}
		finally {
			if (connection != null) try{connection.close();} catch(SQLException e){}
		}
	}

	public void deleteProduct(ProductImpl product){
		Connection connection = null;
		try {
			connection = DatabaseUrl.extract().getConnection();
			Statement stmt = connection.createStatement();
			String query = "DELETE FROM Products WHERE id = " + product.getId();
			stmt.executeQuery(query);
		} catch (Exception e){

		}
		finally {
			if (connection != null) try{connection.close();} catch(SQLException e){}
		}
	}

	public ArrayList<Product> getAllProducts(){
		Connection connection = null;
		ArrayList<Product> products = new ArrayList<Product>();

		try {
			connection = DatabaseUrl.extract().getConnection();
			Statement stmt = connection.createStatement();
			String query = "SELECT * FROM Products";
			ResultSet rs = stmt.executeQuery(query);
			ArrayList<Supplier> suppliers = new ArrayList<Supplier>();
			SuppliersDaoImp suppliersDaoImp = new SuppliersDaoImp();

			while(rs.next()){
//				String suppliersStr = rs.getString("suppliersStr");
//				int length = Arrays.asList(suppliersStr.split(",")).size();
//				List<String> supplierArray = Arrays.asList(suppliersStr.split(","));
//				int supplierId;
//
//				for(int i= 0; i < length; i++){
//					try{
//						String supplierIntStr = supplierArray.get(i);
//						supplierId = Integer.parseInt(supplierIntStr);
//
//					}catch(NumberFormatException nfe){
//						supplierId = 0;
//						System.out.println("error");
//					}
//					suppliersDaoImp.getSupplierbyId(supplierId);
//					suppliers.add(suppliersDaoImp.getSupplierbyId(supplierId));
//				}
				List<Supplier> suppliersList = new ArrayList<Supplier>();

				Product product = new ProductImpl(
						rs.getInt("id"),
						rs.getString("code"),
						rs.getString("name"),
						rs.getString("shortDescription"),
						rs.getString("longDescription"),
						rs.getBigDecimal("price"),
						rs.getString("imageurl"),
						rs.getInt("reOrderLevel"),
						suppliersList,
						rs.getString("shelfLocation"),
						rs.getString("rowLocation"),
						rs.getInt("stockLevel"),
						rs.getBoolean("discontinued")
				);
				products.add(product);
			}
		} catch (Exception e){

		}
		finally {
			if (connection != null) try{connection.close();} catch(SQLException e){}
		}
		return products;
	}

	public Product getProductById(int productId) {
		Connection connection = null;
		Product product = null;
		try {
			connection = DatabaseUrl.extract().getConnection();
			Statement stmt = connection.createStatement();
			String query = "SELECT * FROM Products WHERE id = " + productId;
			ResultSet rs = stmt.executeQuery(query);
			ArrayList<Supplier> suppliers = new ArrayList<Supplier>();

			SuppliersDaoImp suppliersDaoImp = new SuppliersDaoImp();

			//only going to return one
			if(rs.next()){
				String suppliersStr = rs.getString("suppliersStr");
				int length = Arrays.asList(suppliersStr.split(",")).size();
				List<String> supplierArray = Arrays.asList(suppliersStr.split(","));
				int supplierId;

				for(int i= 0; i < length; i++){
					try{
						String supplierIntStr = supplierArray.get(i);
						supplierId = Integer.parseInt(supplierIntStr);

					}catch(NumberFormatException nfe){
						supplierId = 0;
						System.out.println("error");
					}
					suppliersDaoImp.getSupplierbyId(supplierId);
					suppliers.add(suppliersDaoImp.getSupplierbyId(supplierId));
				}

				product = new ProductImpl(
						rs.getInt("id"),
						rs.getString("code"),
						rs.getString("name"),
						rs.getString("shortDescription"),
						rs.getString("longDescription"),
						rs.getBigDecimal("price"),
						rs.getString("imageurl"),
						rs.getInt("reOrderLevel"),
						suppliers,
						rs.getString("shelfLocation"),
						rs.getString("rowLocation"),
						rs.getInt("stockLevel"),
						rs.getBoolean("discontinued")
				);
			}
		} catch (Exception e){

		}
		finally {
			if (connection != null) try{connection.close();} catch(SQLException e){}
		}

		return product;
	}
}
