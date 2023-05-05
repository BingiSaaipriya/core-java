package com.inheritance;

public class Animal extends Dog {
	String jumping;
	public void jumping() {
		System.out.println("jumping");
	}
	@Override
	public void braking() {
		System.out.println("animal is barking");
		super.braking();
	}
	@Override
	public void eating() {
		System.out.println("animal is eating");
		super.eating();
	}

}
