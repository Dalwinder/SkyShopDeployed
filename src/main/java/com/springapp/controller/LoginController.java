package com.springapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/account")
public class LoginController {


	@RequestMapping(method = RequestMethod.GET)
	public String printAccountPage() {
		return "account";
	}
}