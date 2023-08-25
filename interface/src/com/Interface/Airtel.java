package com.Interface;

public class Airtel implements Network {

	@Override
	public void callrate() {
		System.out.println("airtel call rate:"+"1.2p/sec");
		
	}

	

	@Override
	public void datarates() {
		System.out.println("airtel data rate:"+"1.2p/s");
	}
	

}
