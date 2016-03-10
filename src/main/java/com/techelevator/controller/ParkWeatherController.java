package com.techelevator.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class ParkWeatherController {
	
	@RequestMapping(path="/parkWeather", method=RequestMethod.GET)
	public String displayParkWeather(Map<String, Object> model) {
		
		
		
		return "parkWeather";
	}
}
