package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pluralsight.model.Goal;

@Controller
@SessionAttributes("goal")
public class GoalController {

	@RequestMapping(value = "addGoal", method = RequestMethod.GET)
	public String addGoal(Model model) {
		var goal = new Goal();
		goal.setMinutes(10);
		model.addAttribute("goal", goal);
		
		return "addGoal";
	}

	@RequestMapping(value = "addGoal", method = RequestMethod.POST)
	public String updateGoal(@ModelAttribute("goal") Goal goal, Model model) {
		
		System.out.format("Goal:%s%n",goal);
		
		return "redirect:addMinutes.html";
	}

}
