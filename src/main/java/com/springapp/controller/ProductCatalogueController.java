package com.springapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductCatalogueController {


	@RequestMapping(path = "/catalogue", method = RequestMethod.GET)
	public String printCatalogue() {
		return "productCatalogue";
	}

	@RequestMapping(path = "/show_all", method = RequestMethod.GET)
	public String printAllProducts() {
		return "show_all";
	}
}