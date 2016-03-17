package com.techelevator.model;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class AllVotes {
	Map<SurveyVote, Integer> votes;
	private ParkDAO parkDAO;;
	
	public AllVotes(){
		InputStream parkDataInputStream = this.getClass().getResourceAsStream("/data/Parks.tsv");
		parkDAO = new FileSystemParkDAO(parkDataInputStream);
		
		votes = new HashMap<>();
		for(Park p: parkDAO.readAllParks()){
			votes.put(new SurveyVote(p), 0);
		}
	}
	
	public void addNewVote(SurveyVote newVote){
		votes.put(newVote,  votes.get(newVote)+1);
	}
	
	public Map<SurveyVote, Integer> getAllVotes(){
		return votes;
	}

}
