package com.springapp.dao;

import com.heroku.sdk.jdbc.DatabaseUrl;
import com.springapp.model.Address;
import com.springapp.model.Customer;
import com.springapp.model.Department;
import sun.security.util.Password;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomersDaoImp implements CustomersDao {

	@Override
	public Customer getCustomerById(int customerId) {
		return null;
	}

	@Override
	public Customer createCustomer(Customer customer) {
		Connection connection = null;
		try {
			connection = DatabaseUrl.extract().getConnection();
			Statement stmt = connection.createStatement();
//			String query = "INSERT INTO Customer (title, forename, surname, addressLine1, addressLine2, addressLine3, city, postcode Department department, String mobileNumber, String landlineNumber, String login, Password password, boolean securityLevel){)"
//					+ "VALUES ("
//					+ product.getProductTypeId() + ", '"
//					+ product.getProductCode() + "', '"
//					+ product.getName() + "', '"
//					+ product.getLongDescription() + "', "
//					+ product.getPrice()  + ", '"
//					+ product.getImageUrl()  + "')";

			stmt.executeQuery(query);
		} catch (Exception e){

		}
		finally {
			if (connection != null) try{connection.close();} catch(SQLException e){}
		}

		return customer;
	}

	@Override
	public void deleteCustomer(Customer customer) {
		Connection connection = null;
		try {
			connection = DatabaseUrl.extract().getConnection();
			Statement stmt = connection.createStatement();
			String query = "DELETE FROM Customer WHERE ID =" + customer.getCustomerId();
			stmt.executeQuery(query);
		} catch (Exception e){

		}
		finally {
			if (connection != null) try{connection.close();} catch(SQLException e){}
		}
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		Connection connection = null;
		try {
			connection = DatabaseUrl.extract().getConnection();
			Statement stmt = connection.createStatement();
//					String query = "UPDATE Customer SET (id, tid, code, name, longdescription, price, imageUrl)"
//					+ "tid = " + product.getProductTypeId() + ", "
//					+ "code ='" +product.getProductCode() + "', "
//					+ "name = '" + product.getName() + "', "
//					+ "description = '" + product.getLongDescription() + "', "
//					+ "price = " + product.getPrice()  + ", "
//					+ "imageurl ='" + product.getImageUrl()  + "'"
//					+ "where id = " + product.getId();

			stmt.executeQuery(query);
		} catch (Exception e){

		}
		finally {
			if (connection != null) try{connection.close();} catch(SQLException e){}
		}

		return customer
	}

	;
}
