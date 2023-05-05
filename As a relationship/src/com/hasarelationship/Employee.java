package com.hasarelationship;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private double salary;
	private Address address;
	
	
	public Employee() {
		
	}
	public Employee(int id,String name,double salary,Address address) {
		super();
		this.id=id;
		this.name= name;
		this.salary=salary;
		this.address=address;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
}
public String getname() {
	return name;
}
public void setname(String name) {
	this.name=name;
}
public double getsalary() {
	return salary;
}
public void setsalary(double salary) {
	this.salary=salary;
}
@Override
public String toString() {
	return "Employee[id="+id+",name="+name+",salary="+salary+",address="+address+"]";
}
@Override
public int compareTo(Employee o) {
	
	return this.id-o.id;
}
}
