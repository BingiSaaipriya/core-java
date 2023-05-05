package com.hierarchial;


public class A extends Employee{
	
	double hike=00.4;
	public  void incrementsalary() {
	System.out.println("the employee increment salary:'"+(salary+(salary*hike)));
	}
	@Override
	public void displaysalary() {
		// TODO Auto-generated method stub
		super.displaysalary();
	}
	
	

}
