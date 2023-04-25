package com.hashcode;

public class Stringdemo2 {
	public static void main(String[] args) {
		
	
String s1="anil";
String s2=new String("anil");
String s3="anil";
String s4="hello";

System.out.println(s1==s2);//false finding address
s2=s2.intern();
System.out.println(s1==s2);

System.out.println(s1.equals(s2));//finding content compare

System.out.println(s1.hashCode());
System.out.println(s2.hashCode());
System.out.println(s3.hashCode());
System.out.println(s4.hashCode());

	
}
}
