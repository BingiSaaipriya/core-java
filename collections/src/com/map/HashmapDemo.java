package com.map;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {
	public static void main(String[] args) {
		Map objects = new HashMap();
		objects.put(null," createiq");
		objects.put("Newdelhi", "India");
		objects.put(129, "India");
		objects.put("300", "Status code sucess");
		objects.put("900", "status code is failure");
		objects.put(129, "england");
		objects.put("moscow", "russia");
		objects.put(null, "russia");
		objects.put("12333", "ramagundam");
		objects.put(1, null);
		objects.put(2, null);
		System.out.println(objects);
		
	}

}
