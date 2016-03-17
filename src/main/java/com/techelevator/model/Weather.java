package com.techelevator.model;

import java.text.DecimalFormat;

public class Weather {
	
	private String high;
	private String low;
	private String forecast;
	private String day;
	private String parkCode;
	private Suggestions suggestion;
	private String tempScale;
	
	
	public Weather(String parkCode, String tempScale){
		this.parkCode=parkCode;
		this.tempScale=tempScale;
		suggestion = new Suggestions();
	}
	
	public String getHigh() {
		if(tempScale=="celsius"){
			Double celsiusDoubleHigh = (Double.parseDouble(high)-32)/1.8;
			String celsiusFormat = new DecimalFormat("###.#").format(celsiusDoubleHigh);
			return celsiusFormat;
		}
		return high;
	}
	
	
	
	public void setHigh(String high) {
		this.high = high;
	}
	public String getLow() {
		
		if(tempScale=="celsius"){
			Double celsiusDoubleLow =(Double.parseDouble(low)-32)/1.8;
			String celsiusFormat = new DecimalFormat("###.#").format(celsiusDoubleLow);
			return celsiusFormat;
		}
		return low;
	}
	public void setLow(String low) {
		this.low = low;
	}
	public String getForecast() {
		
		return forecast;
	}
	public void setForecast(String forecast) {
		this.forecast = forecast;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	
	public String getParkCode() {
		return parkCode;
	}

	public String getDisplayForecast() {
		String upperCased = forecast.substring(0,1).toUpperCase()+forecast.substring(1,forecast.length());
		if(forecast.equals("partly cloudy")){
			upperCased="Partly Cloudy";
		}
		return upperCased;
	}

	public String getImageName() {
		
		String imageName = "";
		if(forecast.equals("partly cloudy")){
			imageName="partlyCloudy";
		}
		else{
			imageName=forecast;
		}
		return imageName;
	}
	
	
	
	public String getDailySuggestion(){
		String dailySuggestion="";
		if(Integer.parseInt(high)>75){
			dailySuggestion=dailySuggestion+suggestion.getHeatSuggestion();
		}
		if(forecast.equals("rain")){
			dailySuggestion=dailySuggestion+"\nPack rain gear and wear waterproof shoes";
		}
		if(forecast.equals("snow")){
			dailySuggestion= dailySuggestion + "\nRemember your snow shoes";
		}
		if(Integer.parseInt(high)-Integer.parseInt(low)>20){
			dailySuggestion=dailySuggestion+"\nCold weather may cause frostbite";
		}
		if(Integer.parseInt(low)-Integer.parseInt(high)<-20){
			dailySuggestion=dailySuggestion+"\nWear breathable clothes";
		}
		if(forecast.equals("thunderstorm")){
			dailySuggestion=dailySuggestion+"\nSeek shelter and avoid exposed areas";
		}
		if(forecast.equals("sun")){
			dailySuggestion= dailySuggestion + suggestion.getSunSuggestion();
		}
		
		return dailySuggestion;
		
	}

	public void setTempScale(String tempScale) {
		this.tempScale = tempScale;
	}
	
	public String getTempScale(String tempScale) {
		return tempScale;
	}

	

	
	

}
