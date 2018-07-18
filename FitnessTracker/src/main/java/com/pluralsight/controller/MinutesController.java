package com.pluralsight.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pluralsight.model.Activity;
import com.pluralsight.model.Exercise;
import com.pluralsight.service.ExerciseService;

@Controller
public class MinutesController {

	@Autowired
	private ExerciseService exerciseService;

	@RequestMapping(value="/addMinutes", method=RequestMethod.GET)
	public ModelAndView queryMinutes(@ModelAttribute("exercise") Exercise exercise) {

		ModelAndView map = new ModelAndView("addMinutes");
		
		map.addObject("exerciseList", exerciseService.findAllExercises());
		
		return map;
	}

	
	@RequestMapping(value="/addMinutes", method=RequestMethod.POST)
	public ModelAndView addMinutes(@ModelAttribute("exercise") Exercise exercise) {

		ModelAndView map = new ModelAndView("addMinutes");
		
		System.out.format("Exercise: %s",exercise);
		
		exerciseService.addExercise(exercise);
		
		map.addObject("exerciseList", exerciseService.findAllExercises());
		
		return map;
		
		// internal forward ".html" extension is mandatory
		// return "forward:addMoreMinutes.html";
		
		// external redirect
		// return "redirect:addMoreMinutes.html";

	}

	@RequestMapping(value="/addMoreMinutes")
	public String addMoreMinutes(@Valid @ModelAttribute("exercise") Exercise exercise) {

		System.out.format("Exercise more minutes: %s%n",exercise);
		
		return "addMinutes";
	}
	
	public List<Exercise> findAllExercises() {
		return exerciseService.findAllExercises();
	}
	
	@RequestMapping(value="/activities", method=RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities() {
		return exerciseService.findAllActivities();
	}

	
}
