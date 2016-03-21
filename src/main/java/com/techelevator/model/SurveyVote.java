package com.techelevator.model;

import java.io.InputStream;

public class SurveyVote {
	
	private Park votedPark;
	private ParkDAO parkDAO;
	private String user;
	private String timeVoted;
	
	public SurveyVote(Park votedPark){
		this.votedPark = votedPark;
		InputStream parkDataInputStream = this.getClass().getResourceAsStream("/data/Parks.tsv");
		parkDAO= new FileSystemParkDAO(parkDataInputStream);	
	}
	
	public Park getPark(){
		return votedPark;
	}
	
	public String getParkName(){
		Park park = parkDAO.findParkByCode(votedPark.getParkCode());
		return park.getName();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((votedPark == null) ? 0 : votedPark.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SurveyVote other = (SurveyVote) obj;
		if (votedPark == null) {
			if (other.votedPark != null)
				return false;
		} else if (!votedPark.equals(other.votedPark))
			return false;
		return true;
	}

}
