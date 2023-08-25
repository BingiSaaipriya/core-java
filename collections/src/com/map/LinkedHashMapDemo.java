package com.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<String,Double> fruits= new LinkedHashMap<>();
		fruits.put("Apple", 150.00);
		fruits.put("Mango", 80.00);
		fruits.put("Banana", 40.00);
		fruits.put("Grapes", 130.00);
		fruits.put("Orange", 90.00);
		fruits.put("Pineapple", 50.00);
		System.out.println(fruits);
		LinkedHashMap<String,Double> products= new LinkedHashMap<>(fruits);
		products.put("sugar", 150.00);
		products.put("oil", 80.00);
		products.put("dal", 40.00);
		products.put("rice", 130.00);
		for(Map.Entry m:products.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		
			
		}
	}


