package com.springapp.controller;

import com.springapp.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;
@Controller
public class CustomerController {


	//http://www.tutorialspoint.com/spring/spring_mvc_form_handling_example.htm
	@RequestMapping(value = "/newCustomer", method = RequestMethod.GET)
	public ModelAndView login() {
		return new ModelAndView("newCustomer", "command", new Customer());
	}

	//The action of the form : action="/HelloWeb/addStudent">
	@RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
	public String addCustomer(@ModelAttribute("SpringWeb")Customer customer, ModelMap model) {
		//model.addAttribute("name", student.getName());
		//model.addAttribute("age", student.getAge());
		//model.addAttribute("id", student.getId());

		return "result";

		/* In result.jsp
		 <tr>
        <td>Name</td>
        <td>${name}</td>
    </tr>
    <tr>
        <td>Age</td>
        <td>${age}</td>
    </tr>
    <tr>
        <td>ID</td>
        <td>${id}</td>
    </tr>
		 */
	}

}