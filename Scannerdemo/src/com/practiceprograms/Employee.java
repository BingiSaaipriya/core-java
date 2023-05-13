package com.practiceprograms;

public class Employee {
	private int id;
	private String name;
	private double salary;
	
	public Employee() {
		
	}
public Employee(int id,String name, double salary) {
	this.id=id;
	this.salary=salary;
	this.name=name;
	}
public String toString() {
	return "Employee[id="+id+",name="+name+",salary="+salary+"]";
}
}
