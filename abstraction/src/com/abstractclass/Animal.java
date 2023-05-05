package com.abstractclass;
public abstract class Animal {
private	String name;
private int id;
	
	public Animal(String name) {
		this.name=name;
	}
	
	public  int getid() {
		return this. id;
	}
	
	public void Setid(int id) {
		this.id=id;
	}
	
	public abstract void sleep();
	
	public abstract void eat();
	
	public  String getName() {
		return this. name;
	}
	public void setName(String name) {
		this.name=name;
	}
}
