package com.techelevator.model;

public class Park {
	
	String parkCode;
	String name;
	String description;
	String location;
	String acreage;
	String elevation;
	String milesOfTrail;
	String numberOfCampsites;
	String yearFounded;
	String climate;
	String annualVisitorCount;
	
	
	
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

	public String getAcreage() {
		return acreage;
	}

	public void setAcreage(String acreage) {
		this.acreage = acreage;
	}

	public String getElevation() {
		return elevation;
	}

	public void setElevation(String elevation) {
		this.elevation = elevation;
	}

	public String getMilesOfTrail() {
		return milesOfTrail;
	}

	public void setMilesOfTrail(String milesOfTrail) {
		this.milesOfTrail = milesOfTrail;
	}

	public String getNumberOfCampsites() {
		return numberOfCampsites;
	}

	public void setNumberOfCampsites(String numberOfCampsites) {
		this.numberOfCampsites = numberOfCampsites;
	}

	public String getYearFounded() {
		return yearFounded;
	}

	public void setYearFounded(String yearFounded) {
		this.yearFounded = yearFounded;
	}

	public String getClimate() {
		return climate;
	}

	public void setClimate(String climate) {
		this.climate = climate;
	}

	public String getAnnualVisitorCount() {
		return annualVisitorCount;
	}

	public void setAnnualVisitorCount(String annualVisitorCount) {
		this.annualVisitorCount = annualVisitorCount;
	}

}
