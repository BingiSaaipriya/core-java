package com.exceptionhandling;

public class Exceptionpropogation {

	public 	void m1() {
		try {
		int divide =10/0;
		System.out.println("m1 method:"+divide);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}	
		}
	public 	void m2() {
		m1();
		System.out.println("m2 method");
			
	}
	public 	void m3() {
		m2();
		System.out.println("m3 method");
	}
	public static void main(String[] args) {
		Exceptionpropogation method = new Exceptionpropogation();
		method.m3();
	}
			

}

