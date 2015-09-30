package com.springapp.dao;

import com.heroku.sdk.jdbc.DatabaseUrl;
import com.springapp.model.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.util.ArrayList;

public class ProductCatalogueDaoImp implements ProductCatalogueDao {

	public Product insertProduct(Product product){
		Connection connection = null;
		try {
			connection = DatabaseUrl.extract().getConnection();
			Statement stmt = connection.createStatement();
			String query = "INSERT INTO Products (tid, code, name, longDescription, price, imageUrl)"
					+ "VALUES ("
					+ product.getProductTypeId() + ", '"
					+ product.getProductCode() + "', '"
					+ product.getName() + "', '"
					+ product.getLongDescription() + "', "
					+ product.getPrice()  + ", '"
					+ product.getImageUrl()  + "')";

			stmt.executeQuery(query);
		} catch (Exception e){

		}
		finally {
			if (connection != null) try{connection.close();} catch(SQLException e){}
		}

		return product;
	}

	public void updateProduct(Product product){
		Connection connection = null;
		try {
			connection = DatabaseUrl.extract().getConnection();
			Statement stmt = connection.createStatement();
			String query = "UPDATE Products SET (id, tid, code, name, longdescription, price, imageUrl)"
					+ "tid = " + product.getProductTypeId() + ", "
					+ "code ='" +product.getProductCode() + "', "
					+ "name = '" + product.getName() + "', "
					+ "description = '" + product.getLongDescription() + "', "
					+ "price = " + product.getPrice()  + ", "
					+ "imageurl ='" + product.getImageUrl()  + "'"
					+ "where id = " + product.getId();

			stmt.executeQuery(query);
		} catch (Exception e){

		}
		finally {
			if (connection != null) try{connection.close();} catch(SQLException e){}
		}
	}

	public void deleteProduct(Product product){
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
				Product product = new Product(
						rs.getInt("id"),
						rs.getInt("tid"),
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
}
