package com.springapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/basket")
public class BasketController {
    @RequestMapping(method = RequestMethod.GET)
    public String printBasket() {
        return "basket";
    }
}
