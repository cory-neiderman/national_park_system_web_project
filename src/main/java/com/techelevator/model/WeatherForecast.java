package com.techelevator.model;

import java.util.ArrayList;
import java.util.List;

public class WeatherForecast {
	private List<Weather> weatherList;
	private String parkCode;
	
	public WeatherForecast(String parkCode){
		this.parkCode=parkCode;
		weatherList = new ArrayList<>();
	}
	
	public void addDailyWeather(Weather dailyWeather){
		weatherList.add(dailyWeather);
	}
	
	public List<Weather> getWeatherForecast(){
		return weatherList;

	}

	public String getParkCode() {
		
		return parkCode;
	}

}
