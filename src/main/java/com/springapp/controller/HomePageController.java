package com.springapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.net.URI;
import java.net.URISyntaxException;

import static spark.Spark.*;
import spark.template.freemarker.FreeMarkerEngine;
import spark.ModelAndView;
import static spark.Spark.get;

import com.heroku.sdk.jdbc.DatabaseUrl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/")
public class HomePageController {

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome() {

		port(Integer.valueOf(System.getenv("PORT")));
		staticFileLocation("/public");

		//db();
		return "index";
	}

//		public ModelAndView db(){
//		Connection connection = null;
//		Map<String, Object> attributes = new HashMap<String, Object>();
//		try {
//			connection = DatabaseUrl.extract().getConnection();
//
//			Statement stmt = connection.createStatement();
//			stmt.executeUpdate("CREATE TABLE IF NOT EXISTS ticks (tick timestamp)");
//			stmt.executeUpdate("INSERT INTO ticks VALUES (now())");
//			ResultSet rs = stmt.executeQuery("SELECT tick FROM ticks");
//
//			ArrayList<String> output = new ArrayList<String>();
//			while (rs.next()) {
//				output.add("Read from DB: " + rs.getTimestamp("tick"));
//			}
//
//			attributes.put("results", output);
//			return new ModelAndView(attributes, "db.ftl");
//		} catch (Exception e) {
//			attributes.put("message", "There was an error: " + e);
//			return new ModelAndView(attributes, "error.ftl");
//		} finally {
//			if (connection != null) try {
//				connection.close();
//			} catch (SQLException e) {
//			}
//		}
//	}
}