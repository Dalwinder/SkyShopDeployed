package com.springapp.controller;

/**
 * Created by Jo on 27/09/2015.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/product")
public class ProductController {
    @RequestMapping(method = RequestMethod.GET)
    public void addProduct() {

    }
}
