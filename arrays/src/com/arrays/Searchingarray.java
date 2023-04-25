package com.arrays;

public class Searchingarray {
	
	



	public static void main(String args[]) {
		int[] numbers= {10,20,30,40,50};
		int elementstosearch=30;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==elementstosearch) {
				System.out.println(numbers[i]);
			}
		}
		
	
	
	String[]  fruits= {"apple","banana","grapes","orange"};
	String elementsTosearch="banana";
	for(int i=0;i<4;i++) {
		if(fruits[i]==elementsTosearch) {
			System.out.println(fruits[i]);
		}
		}
	
//	//Enhanced loop 1.5version
	for(String fruits1:fruits) {
		System.out.println(fruits1);
	}
		
	}
		
	}
	


