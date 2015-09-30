package com.springapp.controller;

import com.springapp.dao.ProductCatalogueDaoImp;
import com.springapp.model.Product;
import com.springapp.dao.ProductCatalogueDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;

@Controller
@RequestMapping("/product")
public class ProductController {

    @RequestMapping(method = RequestMethod.GET)
    public String printSingleProduct() {
  //      ProductCatalogueDao productCatalogueDao = new ProductCatalogueDaoImp();
    //    ModelAndView model = new ModelAndView("product");
      //  model.addObject("product", product);
        return "index";
    }

}
