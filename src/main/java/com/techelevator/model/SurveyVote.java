package com.techelevator.model;

public class SurveyVote {
	
	private Park votedPark;
	private String user;
	private String timeVoted;
	
	public SurveyVote(Park votedPark){
		this.votedPark = votedPark;
	}
	
	public Park getPark(){
		return votedPark;
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
