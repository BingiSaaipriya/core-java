package com.abstra;

public class Retail extends Clothes {
	
	public void fixedrates() {
		System.out.println("there should be an fixed rates in retailer shops");
	}

	@Override
	public void Brand() {
//		System.out.println("clothes have various brand names");
	}

	@Override
	public void wash() {
//System.out.println("clothes should be washable");		
	}

	@Override
	public void dry() {
//		System.out.println("we can dry clothes");
	}
}
