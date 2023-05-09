package com.sortting;

public class Customer1  implements  Comparable<Customer1> {
	
	private int id;
	private String name;
	private String address;
	private double salary;
	
	public Customer1(int id,String name) {
		this.id=id;
		this.name=name;
		
	}
	public Customer1(int id, String name,String address,double salary) {
		this.id=id;
		this.name=name;
		this.address=address;
		this.salary=salary;
	}
	

	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "id:"+" "+id+" "+"name:"+" "+name+" "+"address:"+" "+address+" "+"salary:"+" "+salary;
		}
	@Override
	public int compareTo(Customer1 c) {
	
		return this.id-c.id; 
	}
}
	
	

	
	//-dto compare
//	@Override
//	public int compareTo(Customer1 d) {
//		// TODO Auto-generated method stub
//		return this.id-d.id;
//	}
	


