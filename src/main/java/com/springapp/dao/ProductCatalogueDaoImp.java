package com.springapp.dao;

import com.heroku.sdk.jdbc.DatabaseUrl;
import com.springapp.model.Product;
import com.springapp.model.ProductImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.util.ArrayList;

public class ProductCatalogueDaoImp implements ProductCatalogueDao {

	public Product insertProduct(ProductImpl product){
		Connection connection = null;
		try {
			connection = DatabaseUrl.extract().getConnection();
			Statement stmt = connection.createStatement();
			String query = "INSERT INTO Products (code, name, shortDescription, longDescription, price, imageurl, rowLocation, shelfLocation, reOrderLevel, stockLevel, discontinued)"
					+ "VALUES ('"
					+ product.getProductCode() + "', '"
					+ product.getName() + "', '"
					+ product.getShortDescription() + "', "
					+ product.getLongDescription() + "', "
					+ product.getPrice()  + ", '"
					+ product.getImageUrl()  + "', '"
					+ product.getRowLocation()  + "', '"
					+ product.getShelfLocation()  + "', '"
					+ product.getReOrderLevel()  + "', '"
					+ product.getStockLevel()  + "', "
					+ product.getDiscontinued()  + ")";
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
			String query = "UPDATE Products SET"
					+ "code ='" + product.getProductCode() + "', '"
					+ "name ='"  + product.getName() + "', '"
					+ "shortDescription ='" + product.getShortDescription() + "', "
					+ "longDescription ='" + product.getLongDescription() + "', "
					+ "price ='" + product.getPrice()  + ", '"
					+ "imageurl ='" + product.getImageUrl()  + "', '"
					+ "rowLocation ='" + product.getRowLocation()  + "', '"
					+ "shelfLocation ='" + product.getShelfLocation()  + "', '"
					+ "reOrderLevel ='" + product.getReOrderLevel()  + "', '"
					+ "stockLevel ='" + product.getStockLevel()  + "', "
					+ "discountinued ='" + product.getDiscontinued()
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

			while(rs.next()){
				Product product = new ProductImpl(
						rs.getInt("id"),
						rs.getString("code"),
						rs.getString("name"),
						rs.getString("shortDescription"),
						rs.getString("longDescription"),
						rs.getBigDecimal("price"),
						rs.getString("imageurl"),
						rs.getString("rowLocation"),
						rs.getString("shelfLocation"),
						rs.getInt("reOrderLevel"),
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

			//only going to return one
			if(rs.next()){
				product = new ProductImpl(
						rs.getInt("id"),
						rs.getString("code"),
						rs.getString("name"),
						rs.getString("shortDescription"),
						rs.getString("longDescription"),
						rs.getBigDecimal("price"),
						rs.getString("imageurl"),
						rs.getString("rowLocation"),
						rs.getString("shelfLocation"),
						rs.getInt("reOrderLevel"),
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
