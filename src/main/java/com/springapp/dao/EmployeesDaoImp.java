//package com.springapp.dao;
//import com.heroku.sdk.jdbc.DatabaseUrl;
//import com.springapp.model.Employee;
//import com.springapp.model.Product;
//
//import javax.servlet.jsp.jstl.sql.Result;
//import java.sql.Connection;
//import java.sql.Statement;
//import java.util.List;
//
//public interface EmployeesDaoImp {
//	public abstract Employee hireEmployee(Employee employee);
//	public abstract void updateEmployee(Employee employee);
//	public abstract void changeEmployeeDepartment(Employee employee);
//	public abstract void fireEmployee(Employee employee);
//	public abstract List getAllEmployees();
//	public abstract List getEmployeesByDepartment(String departmentName);
//
//
//	Connection connection = null;
//		try {
//		connection = DatabaseUrl.extract().getConnection();
//		Statement stmt = connection.createStatement();
//		String query = "SELECT * FROM Products";
//		Result rs = stmt.executeQuery(query);
//		if(rs.next()){
//			Product product = new Product(
//				rs.getInt('id'),
//				rs.getString('tid'),
//				rs.getString('name'),
//				rs.getString('code'),
//				rs.getString('longDescription'),
//				rs.getString('price'),
//				rs.getString('imageurl'),
//				rs.getString('rowLocation'),
//				rs.getString('shelfLocation'),
//				rs.getString('reOrderLevel'),
//				rs.getString('stockLevel'),
//				rs.getBoolean('discontinued'),
//				rs.getBoolean('shortDescription')
//			);
//		}
//		catch(Exception e){
//		}
//	}
//
//
//
//
//	Connection connection = null;
//	try {
//		connection = DatabaseUrl.extract().getConnection();
//		Statement stmt = connection.createStatement();
//		String query = "SELECT * FROM Products";
//		Result rs = stmt.executeQuery(query);
//		if(rs.next()){
//			Product product = new Product(
//					rs.getInt('id'),
//					rs.getString('forename'),
//					rs.getString('surname'),
//					rs.getString('title'),
//					rs.getString('addressLine1'),
//					rs.getString('addressLine2'),
//					rs.getString('addressLine3'),
//					rs.getString('city'),
//					rs.getString('postcode'),
//					rs.getString('mobileNumber'),
//					rs.getString('landlineNumber'),
//					rs.getBoolean('emailNotifications'),
//					rs.getBoolean('smsNotifications')
//					rs.getBoolean('emailSpecialOffers')
//					rs.getBoolean('smsSpecialOffers')
//					rs.getBoolean('postSpecialOffers')
//			)
//
//		}
//
//
//	}
