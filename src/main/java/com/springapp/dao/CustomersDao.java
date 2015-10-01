package com.springapp.dao;

import com.springapp.model.Customer;
import com.springapp.model.Department;

import java.util.List;

public interface CustomersDao {
	public abstract Customer getCustomerById(int customerId);
	public abstract Customer createCustomer(Customer customer);
	public abstract void deleteCustomer(Customer customer);
	public abstract Customer updateCustomer(Customer customer);
}
