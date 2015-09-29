package com.springapp.controller;

import com.heroku.sdk.jdbc.DatabaseUrl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.port;
import static spark.Spark.staticFileLocation;

@Controller
@RequestMapping("/account")
public class AccountController {


	@RequestMapping(method = RequestMethod.GET)
	public String printAccountPage() {
		return "account";
	}
}