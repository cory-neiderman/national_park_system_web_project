package com.techelevator.model;

import java.util.List;

public interface ParkWeatherDAO {
	
	WeatherForecast findWeatherForeCastByCode(String parkCode);

	

}