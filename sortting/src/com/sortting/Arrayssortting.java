package com.sortting;

import java.util.Arrays;

public class Arrayssortting { 
  public static void main (String args[]) {
	  int[] numbers= {10,20,54,99,67,33};
	  for(int i:numbers) {
	 System.out.println(i);
	  }
	  
	  System.out.println("befor sortting");
	  System.out.println(Arrays.toString(numbers));
	  System.out.println("after sortting");
	  Arrays.sort(numbers);
	  System.out.println(Arrays.toString(numbers));
	  
  
  
  String names[]= {"sita","rama","laxman","vivek","anil","anil"};
  Arrays.sort(names);
  System.out.println(Arrays.toString(names));
  
  char vowels []= {'u','e','a','o','i'};
  Arrays.sort(vowels);
  System.out.println(Arrays.toString(vowels));
  
  


  }


}
