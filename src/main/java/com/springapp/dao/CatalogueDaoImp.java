package com.springapp.dao;

import org.springframework.jdbc.support.incrementer.*;
import com.springapp.model.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class CatalogueDaoImp implements CatalogueDao {

	private DataFieldMaxValueIncrementer productIncrementer;

	public void setProductIncrementer(DataFieldMaxValueIncrementer productIncrementer){
		this.productIncrementer = productIncrementer;
	}

	public Product insertProduct(Product product){
		Connection connection = null;
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("DELETE FROM product WHERE ID = 1");
			product = new Product(
					rs.getInt("id"),
					rs.getInt("tid"),
					rs.getString("code"),
					rs.getString("name"),
					rs.getString("description"),
					rs.getBigDecimal("price"),
					rs.getString("imageUrl")
			);
		} catch (Exception e) {
			System.out("message", "There was an error: " + e);
		} finally {
			if (connection != null) try{connection.close();} catch(SQLException e){}
		}

		return product;
	}

	public void updateProduct(Product product){

		Connection connection = null;
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

//	public List getProducts(){
//		Statement stmt = connection.createStatement();
//		ResultSet rs = stmt.executeQuery("SELECT * FROM Products");
//	}
}
