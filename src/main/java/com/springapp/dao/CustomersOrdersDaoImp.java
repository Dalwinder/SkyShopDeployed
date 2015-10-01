package com.springapp.dao;

import com.heroku.sdk.jdbc.DatabaseUrl;
import com.springapp.model.CustomerOrder;
import com.springapp.model.Product;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomersOrdersDaoImp {
	public Product insertProduct(CustomerOrder customerOrder) {

		Connection connection = null;
		try {
			connection = DatabaseUrl.extract().getConnection();
			Statement stmt = connection.createStatement();

			//Creates the base order
			String query = "INSERT INTO CustomerOrders (customerId, orderPlacedDate)"
					+ "VALUES ("
					+ customerOrder.getCustomer().getCustomerId() + ", "
					+ now() + ")";

			//We now need to create all the order details


			stmt.executeQuery(query);
		} catch (Exception e){

		}
		finally {
			if (connection != null) try{connection.close();} catch(SQLException e){}
		}

		return product;
	}


	public void updateProduct(Product product) {

	}


	public void deleteProduct(Product product) {

	}
	//public abstract List getProducts();
}
