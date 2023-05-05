package com.sortting;

import java.util.Arrays;

public class Customertest {


	public static void main(String[] args) {
		Customer c1=new Customer(1, "SaiPriya", "P", "Ramagundam");
		Customer c2=new Customer(4, "Poojitha", "M", "Mancherial");
		Customer c3=new Customer(2, "Raji", "B", "Velala");
		Customer c4=new Customer(3, "Yamini", "B", "Khammam");
		
//		
//		System.out.println(c1.getid());
//		System.out.println(c1.getfirstName());
//		System.out.println(c1.getlastname());
//		System.out.println(c1.getaddress());
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		
		System.out.println("----------------------------------------------------------");
		
		Customer [] customers= {c1,c2,c3,c4};
		Arrays.sort(customers);
		System.out.println(customers);
	
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	
	
	}
	
}

