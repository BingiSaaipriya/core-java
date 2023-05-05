package com.abstractclass;

public  abstract class Airtel extends Network{

	
	
	public Airtel(String name) {
		super(name);
	}

	@Override
	public void callrates() {
System.out.println(getname()+" "+"airtel network call rates:"+"1.22p/sec");		
	}
	
	@Override
	public void datarates() {
System.out.println(getname()+" "+"datarates of airtel:"+"99.00p/sec");		
	}
	
	
	public  abstract void smsrates();
	

}
