package com.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PracticeProgram {
	public static void main(String[] args) {
		Set<String> saidetails = new LinkedHashSet<>();
		saidetails.add("B.tech");
		saidetails.add("M.tech");
		saidetails.add("p.hd");
		Set<String>priyadetails = new LinkedHashSet<>();
		priyadetails.add("B.tech");
		priyadetails.add("M.tech");
		priyadetails.add("p.hd");
		priyadetails.add("12");
		
		Map<String, Set<String>> courses= new HashMap<>();
		courses.put("qwe", saidetails);
		courses.put("lkjh",priyadetails );
		
//		Iterator<Entry<String, Set<String>>> iii= courses.entrySet().iterator();
//		while(iii.hasNext()) {
//			Entry<String, Set<String>> next = iii.next();
//			String person= next.getKey();
//			Set<String> value = next.getValue();
//			System.out.println(next);
//		}
		
		for (Map.Entry<String, Set<String>> ref :courses.entrySet()) {
			
			Set<String> ggg = ref.getValue();
			String person = ref.getKey();
			System.out.println(ref);
//			for(String string :ggg) {
//				if(string.equalsIgnoreCase("12")){
//					System.out.println(ref.getKey()+" "+ref.getValue());
//				}
				
//
		}
		}
	}

		
	
	


