package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pluralsight.model.Exercise;

@Controller
public class MinutesController {

	@RequestMapping(value="/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {

		System.out.println("Exercise: "+exercise);
		
		return "addMinutes";
		
		// internal forward ".html" extension is mandatory
		// return "forward:addMoreMinutes.html";
		
		// external redirect
		// return "redirect:addMoreMinutes.html";

	}

	@RequestMapping(value="/addMoreMinutes")
	public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise) {

		System.out.println("Exercise more minutes: "+exercise);
		
		
		return "addMinutes";
	}

	
}
