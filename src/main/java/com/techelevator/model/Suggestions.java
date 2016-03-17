package com.techelevator.model;

public class Suggestions {
	
	
	private String snowSuggestion;
	private String rainSuggestion;
	private String thunderstormSuggestion;
	private String sunSuggestion;
	private String heatSuggestion;
	private String tempDropSuggestion;
	private String tempRiseSuggestion;
	
	public Suggestions() {
		snowSuggestion = "Remember your snow shoes";
		rainSuggestion ="Pack rain gear and wear waterproof shoes";
		thunderstormSuggestion = "Seek shelter and avoid exposed areas";
		sunSuggestion = "Wear sunblock";
		heatSuggestion= "Bring extra water";
		tempDropSuggestion="Cold weather may cause frostbite";
		tempRiseSuggestion = "Wear breathable clothes";
	}
	
	public String getSnowSuggestion() {
		return snowSuggestion;
	}
	
	public String getRainSuggestion() {
		return rainSuggestion;
	}
	public void setRainSuggestion(String rainSuggestion) {
		this.rainSuggestion = rainSuggestion;
	}
	public String getThunderstormSuggestion() {
		return thunderstormSuggestion;
	}
	public void setThunderstormSuggestion(String thunderstormSuggestion) {
		this.thunderstormSuggestion = thunderstormSuggestion;
	}
	public String getSunSuggestion() {
		return sunSuggestion;
	}
	public void setSunSuggestion(String sunSuggestion) {
		this.sunSuggestion = sunSuggestion;
	}
	public String getHeatSuggestion() {
		return heatSuggestion;
	}
	public void setHeatSuggestion(String heatSuggestion) {
		this.heatSuggestion = heatSuggestion;
	}
	public String getTempDropSuggestion() {
		return tempDropSuggestion;
	}
	public void setTempDropSuggestion(String tempDropSuggestion) {
		this.tempDropSuggestion = tempDropSuggestion;
	}
	public String getTempRiseSuggestion() {
		return tempRiseSuggestion;
	}
	public void setTempRiseSuggestion(String tempRiseSuggestion) {
		this.tempRiseSuggestion = tempRiseSuggestion;
	}
	
}
