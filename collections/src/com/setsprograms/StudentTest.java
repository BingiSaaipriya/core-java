package com.setsprograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class StudentTest {
	public static void main(String[] args) {
		Student s1= new Student(1, "saipriya", 2000.00);
		Student s2= new Student(2, "shyam", 3000.00);
		Student s3= new Student(3, "lalli", 1000.00);
		Student s4= new Student(4, "priyanka", 4000.00);
		Student s5= new Student(5, "arha", 5000.00);
		Student s6= new Student(5, "arha", 5000.00);
		HashSet<Student> ss = new HashSet<>() ;
		ss.add(s1);
		ss.add(s2);
		ss.add(s3);
		ss.add(s4);
		ss.add(s5);
		ss.add(s6);
		
	Iterator<Student> iterator = ss.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
		
//		List<Student> list = new ArrayList<>(ss);
//		Collections.sort();
//		for (Student student : ss) {
//			System.out.println(student);
//			
//		}
//		
	}
	}
}
	
	


