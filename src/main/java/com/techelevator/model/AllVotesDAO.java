package com.techelevator.model;

import java.util.Map;

public interface AllVotesDAO {
	
	public Map<SurveyVote, Integer> getAllVotes();

}
