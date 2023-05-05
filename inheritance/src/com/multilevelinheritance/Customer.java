package com.multilevelinheritance;

public class Customer extends Product {
	String firstname;
String address;

	
public void customer(String firstname,String address) {
	System.out.println(firstname);
	System.out.println(address);
}
//@Override
//public void product(int id, String name, double price) {
//	super.product(id, name, price);
//	


@Override
	public void product(int id, String name, double price) {
	super.product(id, name, price);
	}
	
}
	

