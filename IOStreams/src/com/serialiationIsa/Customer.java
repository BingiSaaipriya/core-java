package com.serialiationIsa;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Customer extends Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double price;
	private String  productname;
	
	public Customer() {
		
	}
	public Customer(int id, String firstname, String lastname, int age,double price, String productname) {
		super(id, firstname, lastname, age);
this.price=price;
this.productname=productname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	
	
	@Override
	public String toString() {
		return "Customer [price=" + price + ", productname=" + productname + ", getId()=" + getId()
				+ ", getFirstname()=" + getFirstname() + ", getLastname()=" + getLastname() + ", getAge()=" + getAge()
				+ "]";
	}
	private void writeobject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();
		oos.writeObject(getFirstname());
		oos.writeObject(getAge());
		oos.writeObject(getId());
//		oos.writeInt(getAge());
		oos.close();	}
	private void readobject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		setId(ois.readInt());
		setFirstname((String) ois.readObject());
		setLastname((String) ois.readObject());
		setAge(ois.readInt());
		ois.close();		
		
		
		
	}
	}
		
	

