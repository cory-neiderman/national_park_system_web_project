package com.techelevator.model;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileSystemWeatherDAO implements ParkWeatherDAO{
	
	
	
	WeatherForecast aForecast;
	private List<Weather> weatherList; 
	private BufferedReader inputReader;
	private String tempScale;
	
	
	public FileSystemWeatherDAO(InputStream input){
		weatherList = new ArrayList<>();
		
		InputStreamReader reader = new InputStreamReader(input);
		inputReader = new BufferedReader(reader);
		throwAwayHeaderLine();
		String line = readNextLine();
		
		while(line != null){
			String[] fields = line.split("\t");
			Weather theWeather = new Weather(fields[0], "default");
			
			theWeather.setDay(fields[1]);
			theWeather.setLow(fields[2]);
			theWeather.setHigh(fields[3]);
			theWeather.setForecast(fields[4]);
			weatherList.add(theWeather);
			line = readNextLine();
		}
		
		
		
	}
	
	public FileSystemWeatherDAO(InputStream input, String tempScale){
		weatherList = new ArrayList<>();
		
		InputStreamReader reader = new InputStreamReader(input);
		inputReader = new BufferedReader(reader);
		throwAwayHeaderLine();
		String line = readNextLine();
		
		while(line != null){
			String[] fields = line.split("\t");
			Weather theWeather = new Weather(fields[0], tempScale);
			
			theWeather.setDay(fields[1]);
			theWeather.setLow(fields[2]);
			theWeather.setHigh(fields[3]);
			theWeather.setForecast(fields[4]);
			weatherList.add(theWeather);
			line = readNextLine();
		}
		
		
		
	}
	
	
	private void throwAwayHeaderLine() {
		readNextLine();
	}
	
	private String readNextLine() {
		String line = null;
		try{
			 line =inputReader.readLine();
		} catch (IOException e){
			
		}
		return line;
	}
	
	
	
	@Override
	public WeatherForecast findWeatherForeCastByCode(String parkCode) {
		aForecast = new WeatherForecast(parkCode);
		for (Weather weather : weatherList){
			if(weather.getParkCode().equals(parkCode)){
				aForecast.addDailyWeather(weather);
			}
		}
		return aForecast;
	}


	

}
