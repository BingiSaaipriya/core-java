package com.hasarelationship;

import java.util.Arrays;

public class Employeetest {
	public static void main(String[] args) {
		Address address= new Address(12, "ban", "865478", "ts");
		System.out.println(address);
		
		Employee e1=new Employee(2,"priya",23000.00,address);
		Employee e2=new Employee(1,"arha",33000.00,address);
		System.out.println(e1);
		System.out.println(e2);
		
	Employee[] employee= {e1,e2};
	Arrays.sort(employee);
	System.out.println(employee);
	for (Employee employee2 : employee) {
		System.out.println(employee2);
		
	}
		
	}

}
