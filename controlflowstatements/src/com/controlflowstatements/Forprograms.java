package com.controlflowstatements;

import java.util.Scanner;

public class Forprograms {
	public static void main(String[] args) {
		int number=5;
		for(int i=0;i<=10;i++) {
			System.out.println(number+"*"+i+"="+number*i);
		}
		
		//0 to 10 numbers
		int numbers=10;
		for(int i=1;i<numbers;i++) {
			System.out.println(i);
		}
		//a to z alphabets
		char ch='a';
		for(ch='a';ch<='z';ch++) {
			System.out.println(ch);
			}
		
		//sum of numbers
		int sum=0;
		for(int i=1;i<=5;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		
		//by dynamically
		System.out.println("enter the table number");
		Scanner te=new Scanner(System.in);
		int num=te.nextInt();
		for (int i=0; i<=10;i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}
		
		
	}

}
