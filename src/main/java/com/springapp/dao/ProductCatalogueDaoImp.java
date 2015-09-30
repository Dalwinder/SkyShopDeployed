package com.springapp.dao;

import com.heroku.sdk.jdbc.DatabaseUrl;
import org.springframework.jdbc.support.incrementer.*;
import com.springapp.model.Product;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ProductCatalogueDaoImp implements ProductCatalogueDao {

	private DataFieldMaxValueIncrementer productIncrementer;

	public void setProductIncrementer(DataFieldMaxValueIncrementer productIncrementer){
		this.productIncrementer = productIncrementer;
	}

	public Product insertProduct(Product product){
		Connection connection = null;
		try {
			//Integer id = productIncrementer.nextIntValue();
			//product.setId(id);
			connection = DatabaseUrl.extract().getConnection();

			Statement stmt = connection.createStatement();
			String query = "DELETE FROM Product WHERE ID = 10";

//			String query = "INSERT INTO Products (id, tid, code, name, description, price, imageUrl)"
//					+ "VALUES (" + id + ", "
//					+ product.getProductTypeId() + ", '"
//					+ product.getProductCode() + "', '"
//					+ product.getName() + "', '"
//					+ product.getDescription() + "', "
//					+ product.getPrice()  + ", '"
//					+ product.getImageUrl()  + "')";

			stmt.executeQuery(query);
		} catch (Exception e) {
			BigDecimal test = new BigDecimal(5.99);
			product = new Product(
				50,
				12,
				e.getMessage(),
				"error",
				"error",
				test,
				"www.google.co.uk"
			);
		}
		finally {
			if (connection != null) try{connection.close();} catch(SQLException e){}
		}

		return product;
	}

	public void updateProduct(Product product){

//		Connection connection = null;
//		try {
//			Statement stmt = connection.createStatement();
//			ResultSet rs = stmt.executeQuery("DELETE FROM product WHERE ID = 1");
//			product = new Product(
//					rs.getInt("id"),
//					rs.getInt("tid"),
//					rs.getString("code"),
//					rs.getString("name"),
//					rs.getString("description"),
//					rs.getBigDecimal("price"),
//					rs.getString("imageUrl")
//			);
//		} catch (Exception e) {
//			attributes.put("message", "There was an error: " + e);
//		} finally {
//			if (connection != null) try{connection.close();} catch(SQLException e){}
//		}
	}

	public void deleteProduct(Product product){
		Connection connection = null;
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("DELETE FROM product WHERE ID = 1");

		} catch (Exception e) {
			System.out.println("There was an error: " + e);
		} finally {
			if (connection != null) try{connection.close();} catch(SQLException e){}
		}
	}

	//public List getProducts(){
//		Statement stmt = connection.createStatement();
//		ResultSet rs = stmt.executeQuery("SELECT * FROM Products");
//	}
}
