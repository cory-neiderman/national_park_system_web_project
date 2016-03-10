package com.techelevator.model;

import java.util.List;


public interface ParkDAO {

	public List<Park> readAllParks();
	public Park findParkByParkCode(String parkCode);
}
