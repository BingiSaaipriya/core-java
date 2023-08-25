package com.abstractclass;

public abstract class Bird extends Animal {

	public Bird(String name) {
		super(name);
		
	}
	@Override
	public void eat() {
		System.out.println(getid()+"......"+" "+getName()+" "+   " "+"feeding.....");
	}
	@Override
	public void sleep() {
		System.out.println(getid()+"....... "+getName()+"  "+  "rest..............");
	}
	
	
	public  abstract void fly();
	

}
