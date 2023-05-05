package com.taskprograms;

public abstract class Vechicle {
	String name;
	double price;

	public Vechicle(String name) {
		this.name=name;
		}
	public String getname() {
		return this.name;
		
	}
	
	
	
	
	
	public abstract void enginee();
	
	public abstract void stops();
	public abstract void starts();
	
	

}
