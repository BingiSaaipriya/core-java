package com.abstraction;

public class Dog extends Bird {
	
	public void Bath() {
		System.out.println("dog is bathing");
		
	}
	public void jumping() {
		System.out.println("dog is jumping");
	}
	@Override
	public void eat() {
		System.out.println("dog is eating");
		
	}
	@Override
	public void sleep() {
		System.out.println("dog is sleeping");
		
	}
	@Override
	public void drink() {
		System.out.println("dog is drinking");
		
	}
	@Override
	void flying() {
		System.out.println("bird is flying");
		super.flying();
	}

}
