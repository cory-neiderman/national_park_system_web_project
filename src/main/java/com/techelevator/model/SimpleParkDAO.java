package com.techelevator.model;

import java.util.ArrayList;
import java.util.List;

public class SimpleParkDAO implements ParkDAO{
	
	private List<Park> parks;
	
	@Override
	public List<Park> readAllParks() {
		parks = new ArrayList<>();
		return null;
	}

	@Override
	public Park findParkByParkCode(String parkCode) {
		// TODO Auto-generated method stub
		return null;
	}

}
