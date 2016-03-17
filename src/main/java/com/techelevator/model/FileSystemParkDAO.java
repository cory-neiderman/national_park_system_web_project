package com.techelevator.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileSystemParkDAO implements ParkDAO{
	
	private List<Park> parkList; 
	private BufferedReader inputReader;
	
	public FileSystemParkDAO(InputStream input){
		parkList = new ArrayList<>();
		InputStreamReader reader = new InputStreamReader(input);
		inputReader = new BufferedReader(reader);
		throwAwayHeaderLine();
		String line = readNextLine();
		
		while(line != null){
			String[] fields = line.split("\t");
			Park thePark = new Park(fields[0]);
			thePark.setName(fields[1]);
			
			
			thePark.setLocation(fields[2]);
			parkList.add(thePark);
			
			line = readNextLine();
			
		}
	}
	
	@Override
	public List<Park> readAllParks(){
		return parkList;
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
	public Park findParkByCode(String parkCode) {
		Park desired = null;
		for(Park p : parkList){
			if(p.getParkCode().equals(parkCode)){
				desired = p;
			}
		}
		return desired;
	}

}
