package com.inter;

public class Kabbadi implements Games{

	@Override
	public void gamename() {
		System.out.println("game name:"+"Kabbadi");
	}

	@Override
	public void score() {
		System.out.println("score for kabbadi team:"+"77.87");
	}

	@Override
	public void teammembers() {
		System.out.println("no of teams:"+"7");
	}

	@Override
	public void time() {
		System.out.println("time taken:"+"3hours");
	}

}
