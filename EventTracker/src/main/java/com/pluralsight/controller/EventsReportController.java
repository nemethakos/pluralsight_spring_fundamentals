package com.pluralsight.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pluralsight.model.Event;

@RestController
public class EventsReportController {

	@RequestMapping("/events")
	public List<Event> getEvents(){
		var result = new ArrayList<Event>();
		
		result.add(new Event("Java User Group"));
		result.add(new Event("Angular User Group"));
		
		return result ;
	}
	
}
