package com.setsprograms;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
	LinkedHashSet<String> capitals = new LinkedHashSet<>();
	capitals.add("london");
	capitals.add("sydney");
	capitals.add("new delhi");
	capitals.add("moscow");
	capitals.add("beezing");
	capitals.add("london");
	System.out.println(capitals);//insertion order is preserved and duplicates
	//are not allowed
	
	}
	

}
