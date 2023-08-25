 package com.Stringdemo;

public class Stringdemo {
	public static void main(String[] args) {
		//reference type
		String s1=" helloworld ";//literal creation
		String s2=new String("helloworld");//using new keyword
		String s3="helloworld";
		String s4="helloworld";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
	
// non reference type
	int a=120;
	int b=10;
	if(a==b) {
	System.out.println("both are same");	
	}else {
	System.out.println("both are differnt values");
}
	
	System.out.println(s1.length());//finding the length
	System.out.println(s1.equals(s2));//comparing
	System.out.println(s1.contains("hi"));
	System.out.println(s1.contains("hello")); //sequences of characters  searching
	System.out.println("before removing white spaces");
	System.out.println(s1);
	System.out.println("after removing white spaces");
	System.out.println(s1.trim());
	char[] chars=s1.toCharArray();
	for (char c : chars) {
	System.out.println(c);
	}
//		
//		byte[] bytes =s1.getBytes();
//	for(byte b1 : bytes) {
//		System.out.println(b1);
//		}
		
	System.out.println(s1.toLowerCase());
 		System.out.println(s1.toUpperCase());
	
	char[] ch= {'s','t','r','i','n','g','s'};
	System.out.println(ch);
	
	char cha=s1.charAt(6);
	System.out.println(cha);
	
	s2=s2.intern();//false statement to overcoming  as true 
	System.out.println(s1==s2);
	
	char[] chh= {'a','r','h','a','s','r','i'};
	System.out.println(chh);
	
	
	
	
	
	
	
	
	
	
	
	
		 
	}

}


