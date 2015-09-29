package com.springapp.controller;
import com.springapp.dao.CatalogueDao;
import com.springapp.dao.CatalogueDaoImp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import static spark.Spark.*;
import com.heroku.sdk.jdbc.DatabaseUrl;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.heroku.sdk.jdbc.DatabaseUrl;
import org.springframework.jdbc.support.incrementer.*;
import com.springapp.model.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;



@Controller
@RequestMapping("/")
public class HomePageController {

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome() {

		port(Integer.valueOf(System.getenv("PORT")));
		staticFileLocation("/public");

		Connection connection = null;
		Map<String, Object> attributes = new HashMap<String, Object>();
		try {
			connection = DatabaseUrl.extract().getConnection();
			Statement stmt = connection.createStatement();

			CatalogueDao catalogueDao = new CatalogueDaoImp();
			Product product = catalogueDao.insertProduct(new Product(
					12,
					"4763",
					"Johnnny boy",
					"Most common name for sale",
					new BigDecimal(5.99),
					"www.google.co.uk"
			));

			String query = "INSERT INTO Products (id, tid, code, name, description, price, imageUrl)"
					+ "VALUES (" + id + ", "
					+ product.getProductTypeId() + ", '"
					+ product.getName() + "', '"
					+ product.getDescription() + "', "
					+ product.getPrice()  + ", '"
					+ product.getImageUrl()  + "')";

			stmt.executeQuery(query);

			return "index";
		} catch (Exception e) {
			attributes.put("message", "There was an error: " + e);
			return "error";
		} finally {
			if (connection != null) try{connection.close();} catch(SQLException e){}
		}
	}

}