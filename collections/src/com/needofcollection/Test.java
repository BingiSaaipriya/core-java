package com.needofcollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
	
		List<Employee> v1 = new ArrayList<>();
		v1.add(new Employee(4, "priya", 50000.00));
		v1.add(new Employee(3, "sri", 30000.00));
		v1.add(new Employee(5, "arha", 20000.00));
		v1.add(new Employee(1, "lalitha", 10000.00));
		v1.add(new Employee(2, "bhanu", 30000.00));
		System.out.println(v1);
		Collections.sort(v1);
		System.out.println(v1);
	}

}
