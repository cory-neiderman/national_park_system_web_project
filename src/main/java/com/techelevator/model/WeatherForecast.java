package com.techelevator.model;

import java.util.ArrayList;
import java.util.List;

public class WeatherForecast {
	private List<Weather> requestedParkForecast;
	private String parkCode;
	private SimpleParkWeatherDAO weatherList;
	
	public WeatherForecast(String parkCode){
		requestedParkForecast=new ArrayList<>();
		this.parkCode=parkCode;
	}
	
	public void addWeather(Weather weather){
		for(Weather w: weatherList.readAllWeather()){
			if(w.getParkCode().equals(parkCode)){
				requestedParkForecast.add(w);
			}
		}
		
	}
	
	public List<Weather> getRequestedParkForecast(){
		return requestedParkForecast;
	}
	
}
