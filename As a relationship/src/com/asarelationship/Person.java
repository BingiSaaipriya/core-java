package com.asarelationship;

public class Person {
	private int id;
	private String name;
	private Address address;
	private Person Spouse;
	
	
	
	public Person() {
		super();
	}
	public   Person(int id, String name,Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public Person(String name,int id) {
		this.id=id;
		this.name=name;
	}
	public  Person(int id,String name, Address address, Person spouse) {
		super();
		this.id=id;
		this.name=name;
		this.address=address;
		this.Spouse=spouse;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Person getSpouse() {
		return Spouse;
	}
	public void setSpouse(Person spouse) {
		Spouse = spouse;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	

}
