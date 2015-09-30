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
import java.util.List;

@Controller
public class ProductCatalogueController {

	@RequestMapping(path = "/catalogue", method = RequestMethod.GET)
	public ModelAndView printCatalogue() {
		ProductCatalogue.getProductCatalogue().removeAllProducts();

		ProductCatalogueDao productCatalogueDao = new ProductCatalogueDaoImp();
		List<Product> list = productCatalogueDao.getAllProducts();
		ProductCatalogue.getProductCatalogue().addListOfProducts(list);

		ModelAndView model = new ModelAndView("show_all");
		model.addObject("products", ProductCatalogue.getProductCatalogue().getProducts());
		return model;
	}
}