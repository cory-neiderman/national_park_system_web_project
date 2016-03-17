package com.techelevator.model;

import java.util.ArrayList;
import java.util.List;

public class SimpleParkWeatherDAO implements ParkWeatherDAO{

	private List<WeatherForecast> forecastList;
	
	public SimpleParkWeatherDAO(){
		forecastList = new ArrayList<>();
		
		WeatherForecast weatherForecastGNP = new WeatherForecast("GNP");
		
		Weather weatherGNPDay1= new Weather("GNP");
		weatherGNPDay1.setHigh("85");
		weatherGNPDay1.setLow("50");
		weatherGNPDay1.setForecast("sunny");
		weatherForecastGNP.addDailyWeather(weatherGNPDay1);
		
		Weather weatherGNPDay2= new Weather("GNP");
		weatherGNPDay2.setHigh("80");
		weatherGNPDay2.setLow("45");
		weatherGNPDay2.setForecast("cloudy");
		weatherForecastGNP.addDailyWeather(weatherGNPDay2);
		
		Weather weatherGNPDay3= new Weather("GNP");
		weatherGNPDay3.setHigh("95");
		weatherGNPDay3.setLow("65");
		weatherGNPDay3.setForecast("thunderstorms");
		weatherForecastGNP.addDailyWeather(weatherGNPDay3);
		
		Weather weatherGNPDay4= new Weather("GNP");
		weatherGNPDay4.setHigh("75");
		weatherGNPDay4.setLow("35");
		weatherGNPDay4.setForecast("partly cloudy");
		weatherForecastGNP.addDailyWeather(weatherGNPDay4);
		
		Weather weatherGNPDay5= new Weather("GNP");
		weatherGNPDay5.setHigh("82");
		weatherGNPDay5.setLow("54");
		weatherGNPDay5.setForecast("sunny");
		weatherForecastGNP.addDailyWeather(weatherGNPDay5);
		
		forecastList.add(weatherForecastGNP);
		
		
		WeatherForecast weatherForecastGCNP = new WeatherForecast("GCNP");
		
		Weather weatherGCNPDay1= new Weather("GCNP");
		weatherGCNPDay1.setHigh("50");
		weatherGCNPDay1.setLow("24");
		weatherGCNPDay1.setForecast("snow");
		weatherForecastGCNP.addDailyWeather(weatherGCNPDay1);
		
		Weather weatherGCNPDay2= new Weather("GCNP");
		weatherGCNPDay2.setHigh("65");
		weatherGCNPDay2.setLow("32");
		weatherGCNPDay2.setForecast("cloudy");
		weatherForecastGCNP.addDailyWeather(weatherGCNPDay2);
		
		Weather weatherGCNPDay3= new Weather("GCNP");
		weatherGCNPDay3.setHigh("75");
		weatherGCNPDay3.setLow("42");
		weatherGCNPDay3.setForecast("partly cloudy");
		weatherForecastGCNP.addDailyWeather(weatherGCNPDay3);
		
		Weather weatherGCNPDay4= new Weather("GCNP");
		weatherGCNPDay4.setHigh("45");
		weatherGCNPDay4.setLow("27");
		weatherGCNPDay4.setForecast("sunny");
		weatherForecastGCNP.addDailyWeather(weatherGCNPDay4);
		
		Weather weatherGCNPDay5= new Weather("GCNP");
		weatherGCNPDay5.setHigh("86");
		weatherGCNPDay5.setLow("48");
		weatherGCNPDay5.setForecast("thunderstorms");
		weatherForecastGCNP.addDailyWeather(weatherGCNPDay5);
		
		forecastList.add(weatherForecastGCNP);
		
		
	}



	@Override
	public WeatherForecast findWeatherForeCastByCode(String parkCode) {
		WeatherForecast desired = null;
		for (WeatherForecast w : forecastList){
			if(w.getParkCode().equals(parkCode)){
				desired = w;
			}
		}
		return desired;
	}
	
	
	
	

}
