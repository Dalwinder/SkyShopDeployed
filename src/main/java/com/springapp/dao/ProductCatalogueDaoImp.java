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

	public Product insertProduct(Product product){
		Connection connection = null;
		try {
			connection = DatabaseUrl.extract().getConnection();
			Statement stmt = connection.createStatement();
			String query = "INSERT INTO Products (tid, code, name, description, price, imageUrl)"
					+ "VALUES ("
					+ product.getProductTypeId() + ", '"
					+ product.getProductCode() + "', '"
					+ product.getName() + "', '"
					+ product.getDescription() + "', "
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
			String query = "UPDATE Products SET (id, tid, code, name, description, price, imageUrl)"
					+ "tid = " + product.getProductTypeId() + ", "
					+ "code ='" +product.getProductCode() + "', "
					+ "name = '" + product.getName() + "', "
					+ "description = '" + product.getDescription() + "', "
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

	//public List getProducts(){
//		Statement stmt = connection.createStatement();
//		ResultSet rs = stmt.executeQuery("SELECT * FROM Products");
//	}
}
