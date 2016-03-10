package com.techelevator.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParkController {
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String displayParkList(Map<String, Object> model) {
		
		
		
		return "parkList";
	}
	
	@RequestMapping(path="/parkDetail", method=RequestMethod.GET)
	public String displayParkDetail(Map<String, Object> model,
									 @RequestParam(name="parkCode") String parkCode) {
		
		
		
		
		return "parkDetail";
	}

}
