package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapDemo2 {
	public static void main(String[] args) {
		HashMap<String , String> countries = new HashMap<>();
		countries.put("india", "NewDelhi");
		countries.put("England", "London");
		countries.put("Russia", "Moscaw");
		countries.put("china", "Beezing");
		countries.put("Australia", "Sydney");
		countries.put("india", "mumbai");
		System.out.println(countries);
		
//		for(String country:countries.keySet()) {
//			System.out.println("keys:"+country+" "+"values:"+countries.get(country));
//		}
//		Set<String> keyset = countries.keySet();
//		Iterator<String> iterator= keyset.iterator();
//		while(iterator.hasNext()) {
//			String country=iterator.next();
//			System.out.println(country);
//			
//		}
		
		String input="ramagundam";
		if(countries.containsKey("india")) {
			countries.put("india", input);
			System.out.println(countries);
		}else {
			countries.put("india", input);
		}
		System.out.println(countries);
//		Iterator<Entry<String, String>> itr=countries.entrySet().iterator();
//		
//		while(itr.hasNext()) {
//			Entry<String, String> next = itr.next();
//			System.out.println(next.getKey()+" "+next.getValue());
//		}	
		
		
	}

}
