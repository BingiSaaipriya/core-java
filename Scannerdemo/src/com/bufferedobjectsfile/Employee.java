package com.bufferedobjectsfile;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private Address address;
	
	public Employee (){
		
	}

	public Employee(int id, String name, double salary,Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address=address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ",Address="+address+"]";
	}

}
