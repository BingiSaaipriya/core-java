package com.taskprograms;

public abstract class Athlete {
	String name;
	String nickname;
	int yearofborn;
	String team;
	int numberofcompetitions;
	public Athlete(String name,String nn,int yy,String team,int numberofcompetitions) {
		this.name=name;
		this.nickname=nn;
		this.numberofcompetitions=numberofcompetitions;
		this.team=team;
		this.yearofborn=yy;
	}
	public String getName() {
		return this. name;
	}
	public String getNickname() {
		return this. nickname;
		
	}
	public String getteam() {
		return team;
	}
	
	
	
	public void getbiodata() {
		System.out.println("name:"+getName());
		System.out.println("nickname:"+getNickname());
		System.out.println("teamname:"+team);
	}
	
	public void  competitions() {
		System.out.println("no of world competitions");
	}
	
	public abstract String Bodytype();


}
