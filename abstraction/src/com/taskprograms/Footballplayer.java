package com.taskprograms;

public class Footballplayer extends Athlete {
	int completions;
	int passingyards1;
	
	
	public Footballplayer(String name, String nn, int yy, String team, int numberofcompetitions,int completions,int passingyards) {
		super(name, nn, yy, team, numberofcompetitions);
		this.completions=completions;
		this.passingyards1=passingyards;
	}


	@Override
	public String Bodytype() {
	
		return "musclarstrength";
	}
	@Override
	public void getbiodata() {
		super.getbiodata();
		System.out.println("current team");
	}
	
	@Override
	public void competitions() {
		super.competitions();
		System.out.println("player running yards");
	}
	

	

	}

		
	


