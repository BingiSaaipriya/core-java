package com.setsprograms;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet< String> fruits = new TreeSet<>();
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("blueberries");
		fruits.add("grapes");
		fruits.add("promogranate");
		fruits.add("peech");
		System.out.println(fruits);
		System.out.println(fruits.lower("promogranate"));
		System.out.println(fruits.lower("orange"));
//		System.out.println(fruits.lower("1234567"));
		System.out.println(fruits.higher("apple"));
		SortedSet<String> subSet=fruits.subSet("apple", "blueberries");
		System.out.println(subSet);
		
		
		
		//for doing descending order we have to use navagiable set
//		NavigableSet<String> navigableset = fruits.descendingSet();
//		Iterator<String> iterator= navigableset.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		
		}

}
