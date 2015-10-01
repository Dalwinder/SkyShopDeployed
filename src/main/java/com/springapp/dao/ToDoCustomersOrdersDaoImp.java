package com.springapp.dao;

import com.heroku.sdk.jdbc.DatabaseUrl;
import com.springapp.model.Customer;
import com.springapp.model.CustomerOrder;
import com.springapp.model.Product;
import com.springapp.model.ProductImpl;
import org.joda.time.DateTime;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CustomersOrdersDaoImp implements CustomersOrdersDao{

	@Override
	public CustomerOrder getOrderByOrderId(int id) {
		return null;
	}

	@Override
	public void cancelOrder(CustomerOrder customerOrder) {

	}

	@Override
	public ArrayList<CustomerOrder> getOrdersByCustomerId(int customerId) {
		Connection connection = null;
		ArrayList<CustomerOrder> customerOrders = new ArrayList<CustomerOrder>();

		try {
			connection = DatabaseUrl.extract().getConnection();
			Statement stmt = connection.createStatement();
			String query = "SELECT * FROM CustomerOrders WHERE customerId = " + customerId;
			ResultSet rs = stmt.executeQuery(query);

			while(rs.next()){
				Statement newStmt = connection.createStatement();
				String innerQuery = "SELECT * FROM CustomerOrdersDetails WHERE orderId = " + rs.getInt("id");
				ResultSet innerQueryrs = stmt.executeQuery(innerQuery);
				CustomerOrder customerOrder = null;

				while(innerQueryrs.next()){
					HashMap productsDelivered = new HashMap<Product, Map<DateTime, Integer>>();
					HashMap productsDispatched = new HashMap<Product, Map<DateTime, Integer>>();
					Map productsOrdered = new Map<Product, Integer>();
					Customer customer = new Customerimpl(); //new construtor arguement
					int productId = rs.getInt("productId");
					ProductCatalogueDaoImp prodCatDao = new ProductCatalogueDaoImp();
					Product product = prodCatDao.getProductById(productId);

					//if the products are delivered then add into productsDelivered
					if(innerQueryrs.getBoolean("isDelivered")){
						Map<DateTime, Integer> deliveredDate = new Map<DateTime, Integer>();
						deliveredDate.put(innerQueryrs.getDate("deliveredDate"), innerQueryrs.getInt("quantity"));
						productsDispatched.put(product, deliveredDate);
					}

					//if the products are dispatched then add into productsDispatched
					if(innerQueryrs.getBoolean("isDispatched")){
						Map<DateTime, Integer> dispatchedDate = new Map<DateTime, Integer>();
						dispatchedDate.put(innerQueryrs.getDate("dateDispatched"), innerQueryrs.getInt("quantity"));
						productsDispatched.put(product, dispatchedDate);
					}

					productsOrdered.put(product, rs.getInt("quantityOrdered"));

					customerOrder = new CustomerOrder(
							rs.getDate("dateOrdered"),//CONVERT TO DATETIME
							productsOrdered,
							productsDispatched,
							productsDelivered,
							rs.getBigDecimal("totalPrice"),
							customer
					);
				}

				if(customerOrder != null)
					customerOrders.add(customerOrder);
			}
		} catch (Exception e){

		}
		finally {
			if (connection != null) try{connection.close();} catch(SQLException e){}
		}
		return customerOrders;
	}

	@Override
	public CustomerOrder markOrderAsDispatched(CustomerOrder customerOrder) {
		return null;
	}

	@Override
	public CustomerOrder markOrderAsDelivered(CustomerOrder customerOrder) {
		return null;
	}

	@Override
	public CustomerOrder updateOrder(CustomerOrder customerOrder) {
		return null;
	}

	@Override
	public CustomerOrder createCustomerOrder(CustomerOrder customerOrder) {
		return null;
	}
}
