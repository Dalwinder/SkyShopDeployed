package com.springapp.controller;

import com.springapp.dao.ProductProductCatalogueDaoImp;
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
    public ModelAndView printSingleProduct() {
        ProductCatalogueDao productCatalogueDao = new ProductProductCatalogueDaoImp();
        Product product = productCatalogueDao.insertProduct(new Product(
                12,
                "4763",
                "Johnnny boy",
                "Most common name for sale",
                new BigDecimal(5.99),
                "www.google.co.uk"
        ));

        ModelAndView model = new ModelAndView("product");
        model.addObject("product", product);
        return model;
    }

}
