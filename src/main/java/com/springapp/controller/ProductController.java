package com.springapp.controller;

import com.springapp.dao.CatalogueDaoImp;
import com.springapp.model.Product;
import com.springapp.dao.CatalogueDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView printSingleProduct() {
        CatalogueDao catalogueDao = new CatalogueDaoImp();
        Product product = catalogueDao.insertProduct(new Product(
                12,
                "4763",
                "John Smith",
                "Most common name for sale",
                new BigDecimal(5.99),
                "www.google.co.uk"
        ));

        ModelAndView model = new ModelAndView("product");
        model.addObject("product", product);
        return model;
    }

}
