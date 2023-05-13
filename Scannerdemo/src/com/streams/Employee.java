package com.streams;

public class Employee {
	public int id;
	public String name;
	private double salary;
	 
	
	public Employee() {
		
	}
	public Employee(int id, String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString() {
		return "Employee[id="+id+",name="+name+",salary="+salary+"]";
		
	}

}
