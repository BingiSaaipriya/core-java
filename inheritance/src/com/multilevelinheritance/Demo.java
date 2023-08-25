package com.multilevelinheritance;

public class Demo {
	
	static int sum(int a,int b) {
		return a+b;
	}
	
	static int sum(int a,int b,int c) {
		
		return a+b+c;
	
	}
	
	public static void main(String[] args) {
		
		sum(1,30,30);
		
	}
}
