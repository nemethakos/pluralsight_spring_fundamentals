package com.pluralsight.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pluralsight.model.Attendee;

@Controller
public class AttendeeController {

	@RequestMapping(value = "/attendee", method = RequestMethod.GET)
	public String displayAttendeePage(Model model) {
		var attendee = new Attendee();

		attendee.setName("attendee");
		attendee.setEmailAddress("email@address");

		model.addAttribute("attendee", attendee);

		return "attendee";
	}

	@RequestMapping(value = "/attendee", method = RequestMethod.POST)
	// form name in ModelAttribute
	public String processAttendee(@Valid Attendee attendee, BindingResult result, Model model) {
		System.out.format("##### Attendee: %s%n", attendee.toString());
		
		System.out.format("Errors: %s%n ", result.toString());
		if (result.hasErrors()) {
			return "attendee";
		}
		
		// POST - REDIRECT pattern
		return "redirect:index.html";
	}

}
