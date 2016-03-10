package com.techelevator.model;

public class Weather {
	
	private String high;
	private String low;
	private String forecast;
	private String day;
	private String parkCode;
	
	
	public Weather(String parkCode){
		this.parkCode=parkCode;
	}
	
	public String getHigh() {
		return high;
	}
	public void setHigh(String high) {
		this.high = high;
	}
	public String getLow() {
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

}
