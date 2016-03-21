package com.techelevator.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class FileSystemAllVotesDAO implements AllVotesDAO{
	
	Map<SurveyVote, Integer> votes;
	//private ParkDAO parkDAO;;
	private BufferedReader inputReader;
	
	public FileSystemAllVotesDAO(InputStream input){
		votes=new HashMap<>();
		InputStreamReader reader = new InputStreamReader(input);
		inputReader = new BufferedReader(reader);
		throwAwayHeaderLine();
		String line = readNextLine();
		
		while(line != null){
			String[] fields = line.split("\t");
			Park aPark = new Park(fields[0]);
			SurveyVote aVote = new SurveyVote(aPark);
			int voteCount = Integer.parseInt(fields[1]);
			votes.put(aVote, voteCount);
			
			line = readNextLine();
		}
		
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
	
	public void addNewVote(SurveyVote newVote) throws IOException{
		votes.put(newVote,  votes.get(newVote)+1);
		
		String fileName="/data/SurveyResults.tsv";
		
		
		String destFileName="/Users/coryneiderman/Documents/survey2.txt";
		
		try(FileReader reader = new FileReader(fileName)) {
			BufferedReader lineReader = new BufferedReader(reader);
			String line = lineReader.readLine();
			try(PrintWriter writer = new PrintWriter(destFileName)){
			while(line!=null){
				String[] fields = line.split("\t");
				if(fields[0].equals("GNP")){
					//String count=String.valueOf(Integer.parseInt(fields[1])+1);
					fields[1]=String.valueOf(Integer.parseInt(fields[1])+1);
					line=fields[0]+"\t"+fields[1];
				}
				writer.println(line);
				line=lineReader.readLine();
			}
			}
		}
		
		
	}
	
	@Override
	public Map<SurveyVote, Integer> getAllVotes(){
		return votes;
	}

	

}
