package com.Anonymousclass;

import java.util.Arrays;
import java.util.Comparator;

public class Student {
	private int id;
	private String name;
	
	public Student() {
		super();
	}
	
	

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	




	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		Student s1=new Student(1,"priya") ;
		Student s2=new Student(2,"meghana") ;
		Student s3=new Student(4,"shyam") ;
		Student s4=new Student(7,"arha") ;
		Student s5=new Student(3,"sri") ;
		Student[] students= {s1,s2,s3,s4,s5};
	
		Comparator<Student> idBasedSorting =new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				
				return s1.getId()-s2.id;
			}
		}; 

			
			
		Arrays.sort(students,idBasedSorting);
		
		for(Student ss:students) {
			System.out.println(ss);
			
		}
	}
	}

