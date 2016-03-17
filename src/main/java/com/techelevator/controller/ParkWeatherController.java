package com.techelevator.controller;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.techelevator.model.AllVotes;
import com.techelevator.model.FileSystemParkDAO;
import com.techelevator.model.FileSystemWeatherDAO;
import com.techelevator.model.Park;
import com.techelevator.model.ParkDAO;
import com.techelevator.model.ParkWeatherDAO;
import com.techelevator.model.SimpleParkDAO;
import com.techelevator.model.SimpleParkWeatherDAO;
import com.techelevator.model.Suggestions;
import com.techelevator.model.SurveyVote;
import com.techelevator.model.Weather;
import com.techelevator.model.WeatherForecast;



@Controller
@SessionAttributes({"tempChoice", "parkChoice", "allVotes"}) 
public class ParkWeatherController {
	
	
	
	private ParkWeatherDAO parkWeatherDAO;
	private ParkWeatherDAO parkWeatherCelsiusDAO;
	private ParkDAO parkDAO;
	private AllVotes allVotes;
	
	
	public ParkWeatherController(){
		
		
		
		InputStream parkWeatherDataInputStream = this.getClass().getResourceAsStream("/data/Weather.tsv");
		parkWeatherDAO= new FileSystemWeatherDAO(parkWeatherDataInputStream);
		
		
		//must read the file again to populate another DAO
		InputStream parkWeatherDataInputStream2 = this.getClass().getResourceAsStream("/data/Weather.tsv");
		parkWeatherCelsiusDAO=new FileSystemWeatherDAO(parkWeatherDataInputStream2, "celsius");
		
		InputStream parkDataInputStream = this.getClass().getResourceAsStream("/data/Parks.tsv");
		parkDAO = new FileSystemParkDAO(parkDataInputStream);
		
		allVotes = new AllVotes();
	}
	

	@RequestMapping(path="/parkWeather", method=RequestMethod.GET)
	public String displayWeatherDetail(Map<String, Object> modelWeatherDetail,
									 @RequestParam(name="parkCode") String parkCode,
									 @RequestParam(name="tempScale", required=false) String tempScale) {
		
		modelWeatherDetail.put("listOfParks", parkDAO.readAllParks());
		
		Park parkToShow = parkDAO.findParkByCode(parkCode);
		modelWeatherDetail.put("parkToShow", parkToShow);
				
		if(modelWeatherDetail.get("tempChoice")==null || modelWeatherDetail.get("tempChoice").equals("fahrenheit")){
			WeatherForecast weatherForecastToShow = parkWeatherDAO.findWeatherForeCastByCode(parkCode);
			modelWeatherDetail.put("forecast", weatherForecastToShow);
		}
		else if(modelWeatherDetail.get("tempChoice").equals("celsius")){
			WeatherForecast weatherForecastToShow = parkWeatherCelsiusDAO.findWeatherForeCastByCode(parkCode);
			modelWeatherDetail.put("forecast", weatherForecastToShow);
		}
		
		
		
		
		
		Suggestions suggestion = new Suggestions();
		modelWeatherDetail.put("suggestion", suggestion);
		
		return "parkWeather";
	}
	
	@RequestMapping(path="/tempScale",	method=RequestMethod.POST)
	public String tempScaleChoice(Map<String, Object> modelWeatherDetail,
			 						@RequestParam(name="parkCode") String parkCode,
			 						@RequestParam(name="tempScale") String tempScale) {
		
		
		modelWeatherDetail.put("parkCode", parkCode);
		modelWeatherDetail.put("tempChoice", tempScale);
		
		
		
		return "redirect:/parkWeather";
	}
	
	@RequestMapping(path="/survey",	method=RequestMethod.POST)
	public String surveySelection(Map<String, Object> modelWeatherDetail,
			 						@RequestParam(name="parkCode") String parkCode,
			 						@RequestParam(name="favoritePark") String favoritePark) {
		
		
		modelWeatherDetail.put("parkCode", parkCode);
		modelWeatherDetail.put("parkChoice", favoritePark);
		Park votedPark = new Park(favoritePark);
		SurveyVote newVote = new SurveyVote(votedPark);
		allVotes.addNewVote(newVote);
		modelWeatherDetail.put("allVotes", allVotes);
		
		
		
		return "redirect:/parkWeather";
		
	}
	
	
}	
	
	
	
	
	
