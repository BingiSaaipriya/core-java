package com.abstractclass;

public class Jio extends Airtel {

	public Jio(String name) {
		super(name);
		//
	}
//	@Override
//	public void datarates() {
//		super.datarates();
//	}
//@Override
//public void callrates() {
//	super.callrates();
//}
	@Override
	public void smsrates() {
		System.out.println(getname()+" "+"sms rates of jio:"+"23.00p/sec");
	}
	
	public void dis() {
		System.out.println("callrates");
		System.out.println("smsrates");
		System.out.println("datarates");
		System.out.println("address");
	}
	

		
	}
	



