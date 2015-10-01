package com.springapp.controller;

import com.springapp.dao.ProductCatalogueDao;
import com.springapp.dao.ProductCatalogueDaoImp;
import com.springapp.model.ProductCatalogue;
import com.springapp.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductCatalogueController {

	@RequestMapping(path = "/catalogue", method = RequestMethod.GET)
	public ModelAndView printCatalogue() {
		ProductCatalogue.getCatalogue().removeAllProducts();

		ProductCatalogueDao productCatalogueDao = new ProductCatalogueDaoImp();
		List<Product> list = productCatalogueDao.getAllProducts();
		ProductCatalogue.getCatalogue().addListOfProducts(list);

		ModelAndView model = new ModelAndView("show_all");
		model.addObject("products", ProductCatalogue.getCatalogue().getProducts());
		return model;
	}

	@RequestMapping(path = "/get/products", method = RequestMethod.GET)
	public ModelAndView getProducts() {
		ModelAndView model = new ModelAndView("index");
		model.addObject("products", ProductCatalogue.getCatalogue().getProducts());
		return model;
	}
}