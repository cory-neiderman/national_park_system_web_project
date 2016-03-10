package com.techelevator.model;

import java.util.ArrayList;
import java.util.List;

public class SimpleParkWeatherDAO implements ParkWeatherDAO{

	private List<Weather> weatherList;
	
	public SimpleParkWeatherDAO(){
		weatherList = new ArrayList<Weather>();
		
		Weather weather1 = new Weather("GNP");
		weather1.setHigh("75");
		weather1.setLow("35");
		weather1.setDay("1");
		weather1.setForecast("rain");
		weatherList.add(weather1);
		
		Weather weather2 = new Weather("GNP");
		weather2.setHigh("85");
		weather2.setLow("45");
		weather2.setDay("2");
		weather2.setForecast("partly cloudy");
		weatherList.add(weather2);
		
		Weather weather3 = new Weather("GNP");
		weather3.setHigh("75");
		weather3.setLow("35");
		weather3.setDay("3");
		weather3.setForecast("rain");
		weatherList.add(weather3);
		
		Weather weather4 = new Weather("GNP");
		weather4.setHigh("75");
		weather4.setLow("35");
		weather4.setDay("4");
		weather4.setForecast("snow");
		weatherList.add(weather4);
	
		Weather weather5 = new Weather("GNP");
		weather5.setHigh("75");
		weather5.setLow("35");
		weather5.setDay("5");
		weather5.setForecast("sun");
		weatherList.add(weather5);
		
		
	}
	
	
	@Override
	public List<Weather> readAllWeather() {
		

		return weatherList;
	}

	@Override
	public Weather findWeatherByCode(String parkCode) {
			Weather desired = null;
			for (Weather w : weatherList){
				if(w.getParkCode().equals(parkCode)){
					desired = w;
				}
			}
			return desired;

		
	}

}
