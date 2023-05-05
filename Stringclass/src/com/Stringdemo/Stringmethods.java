package com.Stringdemo;

public class Stringmethods {
	public static void main(String[] args) {
		String c1="welcome";
		String c2=new String("welcome");
		String c3="welcome";
		System.out.println(c1);
		System.out.println(c1==c2);
		System.out.println(c1==c3);
		System.out.println(c1.length());
		System.out.println(c1.equals(c3));
		System.out.println(c1.contains("hello"));
		System.out.println(c1.toLowerCase());
		System.out.println(c1.toUpperCase());
	c2=c2.intern();
	System.out.println(c1==c2);
	System.out.println(c1.trim());
	System.out.println(c1.substring(1,3));
	System.out.println(c1.substring(2));
	
	
	
	
	

}
}
