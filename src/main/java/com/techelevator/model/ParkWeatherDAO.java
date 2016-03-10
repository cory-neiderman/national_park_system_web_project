package com.techelevator.model;

import java.util.List;

public interface ParkWeatherDAO {
	
	public List<Park> readAllWeather();
	public Park findWeatherByCode(String parkCode);

}
