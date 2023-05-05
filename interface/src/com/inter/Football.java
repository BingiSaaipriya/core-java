package com.inter;

public class Football implements Games {

	@Override
	public void gamename() {
		System.out.println("game name:"+"Football");
	}

	@Override
	public void score() {
		System.out.println("score for football players:"+"88.99");
	}

	@Override
	public void teammembers() {
		System.out.println("no of team members for football players:"+"11members");
	}

	@Override
	public void time() {
		System.out.println("time taken for football players:"+"3hours");
		
	}

}
