package com.setsprograms;

import java.util.TreeSet;

public class TreesetTest {
	public static void main(String[] args) {
		Student s1= new Student(1, "saipriya", 2000.00);
		Student s2= new Student(2, "shyam", 3000.00);
		Student s3= new Student(3, "lalli", 1000.00);
		Student s4= new Student(4, "priyanka", 4000.00);
		Student s5= new Student(5, "arha", 5000.00);
		Student s6= new Student(5, "arha", 5000.00);
		TreeSet< Student> ss = new TreeSet<>();
		ss.add(s1);
		ss.add(s2);
		ss.add(s3);
		ss.add(s4);
		ss.add(s5);
		ss.add(s6);
		
		for (Student student : ss) {
			System.out.println(student);
			
		}
	}

}
