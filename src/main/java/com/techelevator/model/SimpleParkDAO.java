package com.techelevator.model;

import java.util.ArrayList;
import java.util.List;

public class SimpleParkDAO implements ParkDAO{
	
	private List<Park> parkList;
	
	public SimpleParkDAO() {
		parkList = new ArrayList<Park>();
		
		Park park = new Park("GNP");
		park.setName("Glacier National Park");
		park.setDescription("Lorem ipsum dolor sit amet, amet wisi arcu suspendisse, dolor risus est sodales sociis arcu vel, orci sed magna adipiscing massa interdum. Fermentum rutrum nullam hac, nam sodales eleifend pede a, vel ridiculus cursus varius faucibus in in, dapibus integer nobis sem. Mauris ullam");
		park.setLocation("Montana");
		parkList.add(park);
		
		park = new Park("GCNP");
		park.setName("Grand Canyon National Park");
		park.setDescription("Lorem ipsum dolor sit amet, amet wisi arcu suspendisse, dolor risus est sodales sociis arcu vel, orci sed magna adipiscing massa interdum. Fermentum rutrum nullam hac, nam sodales eleifend pede a, vel ridiculus cursus varius faucibus in in, dapibus integer nobis sem. Mauris ullam");
		park.setLocation("Arizona");
		parkList.add(park);
		
		park = new Park("CVNP");
		park.setName("Cuyahoga Valley National Park");
		park.setDescription("Lorem ipsum dolor sit amet, amet wisi arcu suspendisse, dolor risus est sodales sociis arcu vel, orci sed magna adipiscing massa interdum. Fermentum rutrum nullam hac, nam sodales eleifend pede a, vel ridiculus cursus varius faucibus in in, dapibus integer nobis sem. Mauris ullam");
		park.setLocation("Ohio");
		parkList.add(park);
	}
	
	
	@Override
	public List<Park> readAllParks() {
		
		return parkList;
	}

	@Override
	public Park findParkByCode(String parkCode) {
		

		return null;
	}

}
