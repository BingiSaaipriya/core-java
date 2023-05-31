package com.arraylistdemo;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList arraylist = new ArrayList();//default value is 10
		System.out.println(arraylist.size());
		arraylist.add(null);
		arraylist.add("thers is a man");
		arraylist.add('d');
		arraylist.add("true");
		arraylist.add(2000.00);
		arraylist.add(100);
		arraylist.add(100);
		arraylist.add(12.2f);
		arraylist.add(null);
		System.out.println(arraylist);
		System.out.println("**************************");
		for (int counter = 0; counter < arraylist.size(); counter++) {
			System.out.println(arraylist.get(counter));
		}

		Iterator iterator = arraylist.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("**********************************");

		for (Object object : arraylist) {
			System.out.println(object);
		}
		System.out.println("**********************************");

		// java 8 lambda expression
		arraylist.forEach(System.out::println);
		
	}

	}


