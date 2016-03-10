package com.techelevator.model;

import java.util.List;

public interface ParkWeatherDAO {
	
	public List<Weather> readAllWeather();
	
	public Weather findWeatherByCode(String parkCode);

}
