package com.springapp.controller;
import com.springapp.model.CustomerOrder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String printHomePage() {
		return "index";
	}

	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String printLoginPage() {
		return "login";
	}

	@RequestMapping(path = "/account", method = RequestMethod.GET)
	public String printAccountPage() {
		return "account";
	}

	@RequestMapping(path = "/product", method = RequestMethod.GET)
	public String printProduct() {
		return "product";
	}

	@RequestMapping(path = "/show_all", method = RequestMethod.GET)
	public String printAllProducts() {
		return "show_all";
	}

	@RequestMapping(path = "/confirmation", method = RequestMethod.GET)
	public String printConfirmation() {
		return "confirmation";
	}

	@RequestMapping(path = "/basket", method = RequestMethod.GET)
	public String printBasket(Model model) {
		model.addAttribute("order", new CustomerOrder());
		return "basket";
	}
}