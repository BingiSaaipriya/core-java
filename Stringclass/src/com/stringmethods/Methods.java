package com.stringmethods;

import java.util.Arrays;

public class Methods {
	public static void main(String[] args) {
		String s1="hello world";
		String s2=new String("hello world");
		String s3="hello world";
		String s4="hello what are you doing";
		String s5="where*ar*e you";
		String s6="121";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	System.out.println(s1.equals(s2));
	System.out.println(s1.length());//finding length
	System.out.println(s1.contains("he"));//finding character
	System.out.println(s1.contains("He"));
	//before spaces
	System.out.println(s1);
	//after removing white spaces
	System.out.println(s1.trim());
	System.out.println(s1.equalsIgnoreCase(s3));
	
	System.out.println(s1.startsWith(" h"));
	System.out.println(s2.endsWith("ld"));
	
	
	System.out.println(s1.trim().toLowerCase());
	System.out.println(s3.toUpperCase());
	
	char[] a=s1.toCharArray();
	for(char c:a) {
	System.out.println(c);
	}
	System.out.println(s1.indexOf("w"));
System.out.println(s1.lastIndexOf("l"));

System.out.println(s1.substring(2,5));

System.out.println(Arrays.toString(s4.split(" ")));
System.out.println(Arrays.toString(s5.split("\\*")));
	System.out.println(s1.charAt(5));
	
	System.out.println(s4.replace('o', 'x'));//replacing characters
	int i=Integer.valueOf(s6);//converting string to integer
	System.out.println(i);
	int j=234567;
	String s7=String.valueOf(j);// converting integer to string
	System.out.println(j);
	
	
	String c1;
	String c2=" ";
	String c3="";
	System.out.println(c2.length());
	System.out.println(c2.trim().isEmpty());
	System.out.println(c2.isBlank());
	
	
	
		
		
	
	}
}


