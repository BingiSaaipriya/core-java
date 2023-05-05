package com.hierarchial;



public class Temporaryemployee extends Employee {
	
	double hike=0.35;

	public void decrementsalary() {
		System.out.println("the employee decrement salary:"+(salary+(salary*hike)));
	}
	
	

}
