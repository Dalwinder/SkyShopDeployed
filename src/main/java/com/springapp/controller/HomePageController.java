package com.springapp.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import static spark.Spark.*;
import com.heroku.sdk.jdbc.DatabaseUrl;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;


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
			return "index";
		} catch (Exception e) {
			attributes.put("message", "There was an error: " + e);
			return "error";
		}
	}
}