package com.techelevator.model;

public class Park {
	
	String parkCode;
	String name;
	String description;
	String location;
	int acreage;
	int elevation;
	int milesOfTrail;
	int numberOfCampsites;
	int yearFounded;
	int climate;
	int annualVisitorCount;
	
	
	
	public Park(String parkCode){
		this.parkCode=parkCode;
	}

	public String getParkCode() {
		return parkCode;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getAcreage() {
		return acreage;
	}

	public void setAcreage(int acreage) {
		this.acreage = acreage;
	}

	public int getElevation() {
		return elevation;
	}

	public void setElevation(int elevation) {
		this.elevation = elevation;
	}

	public int getMilesOfTrail() {
		return milesOfTrail;
	}

	public void setMilesOfTrail(int milesOfTrail) {
		this.milesOfTrail = milesOfTrail;
	}

	public int getNumberOfCampsites() {
		return numberOfCampsites;
	}

	public void setNumberOfCampsites(int numberOfCampsites) {
		this.numberOfCampsites = numberOfCampsites;
	}

	public int getYearFounded() {
		return yearFounded;
	}

	public void setYearFounded(int yearFounded) {
		this.yearFounded = yearFounded;
	}

	public int getClimate() {
		return climate;
	}

	public void setClimate(int climate) {
		this.climate = climate;
	}

	public int getAnnualVisitorCount() {
		return annualVisitorCount;
	}

	public void setAnnualVisitorCount(int annualVisitorCount) {
		this.annualVisitorCount = annualVisitorCount;
	}

}
