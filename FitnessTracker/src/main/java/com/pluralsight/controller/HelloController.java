package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	// every request with /greeting(+".html") pathname will cause this method
	// to be called
	@RequestMapping(value="/greeting")
	public String sayHello(Model model) {
		
		// add attribute to the model which can be used in the jsp page
		model.addAttribute("greeting", "Hello World");
		
		// name of the jsp file without .jsp
		// similar to JSF actions
		return "hello";
	}
	
}
