package com.map;


import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapDemo {
	public static void main(String[] args) {
//		TreeSet<Employee> treeset = new TreeSet<>();
//		treeset.add(new Employee(1, "sahithi", 2000.00));
//		treeset.add(new Employee(3, "priya", 50000.00));
//		treeset.add(new Employee(6, "Thriveni", 30000.00));
//		treeset.add(new Employee(2, "usha", 22000.00));
//		treeset.add(new Employee(5, "Latha", 15000.00));
//		treeset.add(new Employee(4, "Prasad", 10000.00));
//		System.out.println(treeset);
		
		TreeMap<Employee,String> hhh = new TreeMap<>();
		hhh.put( new Employee(1, "sahithi", 2000.00),"2");
		hhh.put( new Employee(4, "priya", 22000.00),"9");
		hhh.put( new Employee(5, "lucky", 21000.00),"1");
		hhh.put( new Employee(2, "honey", 99000.00),"5");
		hhh.put( new Employee(3, "chicky", 30000.00),"3");
				System.out.println(hhh);
		
	}

}
