package com.sortting;

import java.util.Arrays;

public class Studenttest {
	public static void main(String[] args) {
		Student s1=new Student(1, "priya", "gdk", 20000.00,'f');
		Student s2=new Student(4, "pooja", "karimnagar", 60000.00,'f');
		Student s3=new Student(5, "navya", "housingboard", 40000.00,'f');
		Student s4=new Student(2, "priyanka", "hyd", 10000.00,'f');
		Student s5=new Student(3, "divya", "bang", 22000.00,'f');
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
	System.out.println(s5);
	
	System.out.println("after sorting...........");
	Student[] ss= {s1,s2,s3,s4,s5};
	Arrays.sort(ss);
	System.out.println(ss);
	for(Student cc:ss) {
	System.out.println(cc);
	
	
	
	
	
	}
	
	


}
}
