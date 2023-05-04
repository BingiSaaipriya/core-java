package com.clonemethods;

public class Customer implements  Cloneable{
	private int id;
	private String name;
	private Address address;
	public Order orderstatus;
	
	
	
	public Customer(int id,String name,Address address) {
		super();
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	public Customer(int id, String name, Address address,Order orderstatus) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.orderstatus=orderstatus;
	}

	public int getid() {
		return id;
	}
public void setid(int id) {
	this.id=id;
}
public String getname() {
	return name;
}
public void setname(String name) {
	this.name=name;
}

public Address getaddress() {
	return address;
}
public void setaddress(Address address) {
	this.address=address;
}


public Order getOrderstatus() {
	return orderstatus;
}

public void setOrderstatus(Order orderstatus) {
	this.orderstatus = orderstatus;
}


@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", orderstatus=" + orderstatus + "]";
}

@Override
protected Object clone() throws CloneNotSupportedException {
	
	Customer Cloned=(Customer) super.clone();
	Cloned.setaddress((Address)Cloned.getaddress().clone());
	Cloned.setOrderstatus((Order)Cloned.getOrderstatus().clone());
	return Cloned;
}
}
