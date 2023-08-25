package com.setsprograms;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> names = new HashSet<>();
		names.add("A");
		names.add("B");
		names.add("C");
		names.add("E");
		names.add("G");
		names.add("F");
		names.add("D");
		 
		names.add(null);
		names.add(null);
//		System.out.println(names);
//		System.out.println(names.remove("esha"));
//		System.out.println(names);
//		System.out.println(names.contains("arha"));
//		System.out.println(names.size());
		
		for (String string : names) {
			System.out.println(string);
		}
		
		
	
	}

}
