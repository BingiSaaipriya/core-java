package com.inter;

public class Cricket implements Games{

	@Override
	public void gamename() {
		System.out.println("game name:"+"cricket");
		
	}

	@Override
	public void score() {
		System.out.println("score of the cricket players:"+"99.9");
		
	}

	@Override
	public void teammembers() {
		System.out.println("no of team members in cricket:"+"11");
		
	}

	@Override
	public void time() {
		System.out.println("time taken for cricket players:"+"5hours");
		
	}
	

}
