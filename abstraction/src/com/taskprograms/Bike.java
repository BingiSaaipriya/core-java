package com.taskprograms;

public class Bike extends Car {

	public Bike(String name) {
		super(name);
		
	}

	@Override
	public void colour() {
		System.out.println(getname()+" "+"the car colour is black");
		
		
	}
	public static void main(String[] args) {
	Bike bb=new Bike("rangerover");
	bb.colour();
	bb.enginee();
	bb.starts();
	bb.stops();
	}

}
