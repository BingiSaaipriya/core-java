package com.exceptionhandling;

public class Exceptiondemo {
	public static void main(String[] args) {
		System.out.println("statement1");
		System.out.println("statement2");
		try {
			System.out.println(10/0);
		}catch(ArithmeticException ae) {
			
		System.out.println("please provide alternate number");
		}
		try {
		String s1="123";
		System.out.println(Integer.parseInt(s1));
		}catch(NumberFormatException ne) {
			System.out.println("A string cannot convert into a number");
		}
		System.out.println("statement4");
		System.out.println("statement5");
		System.out.println("statement6");
	}

}
