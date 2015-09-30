package com.springapp.controller;

import com.springapp.dao.ProductCatalogueDao;
import com.springapp.dao.ProductCatalogueDaoImp;
import com.springapp.model.ProductCatalogue;
import com.springapp.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class ProductCatalogueController {

	@RequestMapping(path = "/catalogue", method = RequestMethod.GET)
	public ModelAndView printCatalogue() {
		ProductCatalogueDao productCatalogueDao = new ProductCatalogueDaoImp();
		ArrayList<Product> list = productCatalogueDao.getAllProducts();
		ProductCatalogue.getProductCatalogue().removeAllProducts();
		ProductCatalogue.getProductCatalogue().addListOfProducts(list);

		ModelAndView model = new ModelAndView();
		model.addObject("show_all", ProductCatalogue.getProductCatalogue());
		return model;
	}


	@RequestMapping(path = "/show_all", method = RequestMethod.GET)
	public String printAllProducts() {
		return "show_all";
	}
}