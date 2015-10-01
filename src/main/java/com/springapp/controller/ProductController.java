package com.springapp.controller;

import com.springapp.dao.ProductCatalogueDao;
import com.springapp.dao.ProductCatalogueDaoImp;
import com.springapp.model.Product;
import com.springapp.model.ProductCatalogue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by dba32 on 01/10/15.
 */
public class ProductController {

    @RequestMapping(path = "/product", method = RequestMethod.GET)
    public ModelAndView printProduct(HttpServletRequest request) {
        int id;

        try{
            id = Integer.parseInt(request.getParameter("id"));
        }catch (NumberFormatException e){
            System.out.print("error");
            id = 0;
        }
        Product product;

        ProductCatalogueDaoImp productCatalogueDao = new ProductCatalogueDaoImp();

        product = productCatalogueDao.getProductById(id);

        ModelAndView model = new ModelAndView("product");
        model.addObject("product", product);
        return model;
    }
}
