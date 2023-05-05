package com.inter;

public class Basketball implements Games {

	@Override
	public void gamename() {
System.out.println("game name:"+"Basketball");		
	}

	@Override
	public void score() {
		System.out.println("score for basketball players:"+"99.99");		
	}

	@Override
	public void teammembers() {
		System.out.println("no of team members for basketball players:"+"5members")	;
	}

	@Override
	public void time() {
		System.out.println("time taken:"+"6hours");		
		

}
}
