package com.abstractclass;

public class Penguin extends Bird {

	public Penguin(String name) {
		super(name);
	}
	
	@Override
	public void fly() {
		System.out.println(getName()+" "+"i cant fly used swim only");
		
	}
	
	public void display() {
		System.out.println("eat");
		System.out.println("slep");
		System.out.println("fly");
	
		
	}
	
	public static void main(String[] args) {
		Penguin pp=new Penguin("parrot");
		pp.Setid(1);
		pp.eat();
		pp.sleep();
		pp.fly();
		pp.getid();
		pp.display();

	
		pp.setName("peacock");
		pp.eat();
		pp.sleep();
		pp.fly();
		pp.getName();
	}
}
