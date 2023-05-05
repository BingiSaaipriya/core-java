package com.controlflowstatements;

public class Ifelsestatements {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		if(a>b) {
			System.out.println(" a is big");
		}else {
			System.out.println(" b is big");
		}
		if((a>b)&&(a>c)) {
			System.out.println(" a is big");
		}else if((b>a)&&(b>c)) {
			System.out.println(" b is big");
		}else {
			System.out.println(" c is big");
		}
		
		
		int num=-2;
		if(num>0) {
			System.out.println(" num is positive:"+num);
		}else if(num==0) {
			System.out.println("num is zero:"+num);
		}else {
			System.out.println(" num is negative:"+num);
		}
		System.out.println( );
		
		int num3=55;
		if((num3 % 5==0)&&(num3 % 11==0)){
			System.out.println(" num is divisible by 5 and 11");
			}else {
				System.out.println("num is not divisible by 5 and 11");
			}
		System.out.println( );
		
		int num4=19;
		if(num4 % 2==0) {
			System.out.println(" num is even");
		}else {
			System.out.println(" num is odd");
		}
		
		int year=2005;
		if((year % 4==0)&&(year %100!=0)||(year %400==0)) {
			System.out.println(" year is a leap year");
		}else {
			System.out.println(" common year");
		}
		
		char ch='s';
		if((ch>='a')&&(ch<='z')||(ch>='A')&&(ch<='Z')) {
			System.out.println(" character is an alphabet");
		}else {
			System.out.println(" character is not an alphabet");
		}
		
		String penname="parker";
		int id=101;
		String colour="black";
		System.out.println(penname);
		System.out.println(id);
		System.out.println(colour);
		if(penname=="parker"&&id==101&&colour=="black") {
			{
				System.out.println("our pen info:"+penname+" , "+id+" , "+colour);
			}
		}
		
		char cha='p';
		if((cha>='a')||(cha>='e')||(cha>='i')|(cha>='o')||(cha>='u')) {
			System.out.println(" p is an vowel");
		}else if((cha>='a')&&(cha>='z')||(cha>='A')&&(cha>='Z')) {
			System.out.println(" a is an constant");
		}else {
			System.out.println(" p is  not an vowel");
		}
		
		char chr='a';
		if((chr>='a')&&(chr>='z')) {
			System.out.println(" c is an lower case");
				}else if((chr>='A')&&(chr>='Z')) {
					System.out.println(" c is an uppercase");
				}else {
					System.out.println(" is not a character");
				}
		int week=3;
		if(week==1) {
			System.out.println("monday");
		}else if(week==2) {
			System.out.println("tuesday");
			}else if(week==3) {
				System.out.println("wednesday");
			}else {
				System.out.println("please enter a valid week day");
			}
		
		//month
		
		int month=3;
		if(month==1||month==3||month==7||month==5||month==9||month==11) {
			System.out.println("months of 31 days");
		}else if(month==29) {
			System.out.println("month of 29");
		}else {
		
			System.out.println("please enter a valid week day");
		}
		
		//triangle
		int angle1=10;
		int angle2=40;
		int angle3=9;
		int sum=150;
		if(sum==150&&angle1>=0&&angle2>=0&&angle3>=0) {
			System.out.println("it is a triangle");
		}else {
			System.out.println("it is not a triangle");
		}
		
		//valid angle
		int a1=10;
		int b1=6;
		int c1=9;
		if((a1+b1>c1)&&(a1+c1>b1)&&(b1+c1>a1)) {
			System.out.println("it is a valid angle");
			}else {
				System.out.println("it is not a valid angle");
			}
	}

}
