package com.accessmodifiers;

import accessmodifiers.ClassA;

public class ClassAa extends ClassA {

	public static void main(String[] args) {
		ClassA priya=new ClassA();
		priya.public1();
		
		ClassA sai = new ClassAa();
		sai.public1();
		
		ClassAa sai2=new ClassAa();
		sai2.protected1();
		sai2.public1();
		
		

	}

}
