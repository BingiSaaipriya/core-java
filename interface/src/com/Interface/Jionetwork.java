package com.Interface;

public class Jionetwork implements Network {

	@Override
	public void callrate() {
		System.out.println("jio call rate:"+"1.11p/sec");
		
	}

	@Override
	public void smsrates() {
		// TODO Auto-generated method stub
		System.out.println("jio sms rate:"+"1.23p/sec");
	}

	@Override
	public void datarates() {
		// TODO Auto-generated method stub
		System.out.println("jio data rate:"+"1.00p/sec");
	}
	

}
