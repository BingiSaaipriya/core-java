package com.abstra;

public class B extends A {

	@Override
	void sum() {
		System.out.println("operation");
	}
	
	void multi() {
		System.out.println("multi");
	}
	@Override
	void add() {
		super.add();
		System.out.println("addition");
	}
	
	
	

}
