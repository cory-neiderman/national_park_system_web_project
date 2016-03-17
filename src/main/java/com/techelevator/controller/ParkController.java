package com.techelevator.controller;

import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.techelevator.model.FileSystemParkDAO;
import com.techelevator.model.Park;
import com.techelevator.model.ParkDAO;
import com.techelevator.model.SimpleParkDAO;
import com.techelevator.model.Weather;


@Controller
public class ParkController {
	
	private ParkDAO parkDAO;
	
	public ParkController(){
		InputStream parkDataInputStream = this.getClass().getResourceAsStream("/data/Parks.tsv");
		parkDAO= new FileSystemParkDAO(parkDataInputStream);
		
		
	}
	
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String displayParkList(Map<String, Object> modelListOfParks) {
		modelListOfParks.put("listOfParks", parkDAO.readAllParks());
		
		
		return "parkList";
	}
	
	
	@RequestMapping(path="/parkDetail", method=RequestMethod.GET)
	public String displayParkDetail(Map<String, Object> modelParkDetail,
									 @RequestParam(name="parkCode") String parkCode) {
		Park parkToShow = parkDAO.findParkByCode(parkCode);
		modelParkDetail.put("parkToShow", parkToShow);
	
		return "parkDetail";
	}

	
	
	
	
	
	
	
}
