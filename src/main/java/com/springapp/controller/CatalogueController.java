package com.springapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/catalogue")
public class CatalogueController {


	@RequestMapping(method = RequestMethod.GET)
	public String printCatalogue() {
		return "productCatalogue";
	}

	@RequestMapping(path = "/show_all", method = RequestMethod.GET)
	public String printAllProducts() {
		return "show_all";
	}
}