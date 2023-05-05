package com.operators;

public class Ternaryoperators {
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		int x=200;
		int y=200;
		
		System.out.println(x==y);
		System.out.println(x!=y);
		System.out.println(x<y);
		System.out.println(x>y);
		System.out.println(x<=y);
		System.out.println(x>=y);
		
		int result=a>b?a:b;
		System.out.println(result);
		int c=20;
		int d=30;
		int value=c>d?c:d;
		System.out.println(value);
		int value1=c<d?c:d;
		System.out.println(value1);
		
		
		String output=a>b?"a is big":"b is big";
		System.out.println(output);
		
		String input=a<b?"a is small": " b is small";
		System.out.println(input);
		
		
		
	}

}
