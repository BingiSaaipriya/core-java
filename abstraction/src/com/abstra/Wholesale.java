package com.abstra;

public class Wholesale extends Clothes{
	
	public void nonfixedrate() {
		System.out.println("in wholesale their is no fixrd rates");
	}
	
	@Override
	public void Brand() {
		System.out.println("clothes having various brandnames");
		
	}
	@Override
	public void wash() {
		System.out.println("clothes should be washable");
		
	}
	@Override
	public void dry() {
		System.out.println("we can dry clothes");
		
	}

}
