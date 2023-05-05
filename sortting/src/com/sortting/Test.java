package com.sortting;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		Customer1 c1=new Customer1(1, "shyam");
	System.out.println(c1);
		Customer1 c2 =new Customer1(2,"priya", "gdk", 20000.00);
		System.out.println(c2);
		Customer1 c3 =new Customer1(4,"sai", "rdm", 40000.00);
		System.out.println(c3);
		Customer1 c4 =new Customer1(1,"lalitha", "mncl", 10000.00);
		System.out.println(c4);
		Customer1 c5 =new Customer1(3,"priyanka", "bang", 60000.00);
		System.out.println(c5);



		
		
		Customer1[] customer= {c1,c2,c3,c4,c5};
		Arrays.sort(customer);
		System.out.println(Arrays.toString(customer));
		for (Customer1 customer1 : customer) {
			System.out.println(customer1);
		}
	}

}
