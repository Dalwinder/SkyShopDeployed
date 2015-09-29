package com.springapp.controller;

import com.springapp.model.ProductCatalogue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/catalogue")
public class ProductCatalogueController {

    @RequestMapping(method = RequestMethod.GET)
    public String getProducts() {

      return "productCatalogue";
      //  ModelAndView model = new ModelAndView("index");
	//	model.addObject("products", ProductCatalogue.getCatalogue().getProducts());
      //  return model;
    }
}
