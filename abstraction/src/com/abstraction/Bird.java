package com.abstraction;

public abstract class Bird extends Animal {
	
	void flying() {
		System.out.println("bird isflying");
	}


	@Override
	public void eat() {
		System.out.println("bird is eating");
		
	}

	@Override
	public void sleep() {
		System.out.println("bird is sleeping");
		
		
	}

	@Override
	public void drink() {
		System.out.println("bird is drinking");
		
		
	}
}
