package com.springapp.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import static spark.Spark.*;
import com.heroku.sdk.jdbc.DatabaseUrl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


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
			Logger logger = Logger.getLogger("MyLog");
			FileHandler fh;

			try {

				// This block configure the logger with handler and formatter
				fh = new FileHandler("/Users/dba32/Documents/BootCamp Files/MyLogFile2.log");
				logger.addHandler(fh);
				SimpleFormatter formatter = new SimpleFormatter();
				fh.setFormatter(formatter);

				// the following statement is used to log any messages
				logger.info("There was an error: " + e);

			} catch (SecurityException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}

			logger.info("Hi How r u?");

			return "error";
		}
		finally {
			if (connection != null){
				try{connection.close();} catch(SQLException e){}
			}
		}
	}
}