package com.asarelationship;

import java.util.Arrays;

public class Customertest {

	public static void main(String[] args) {
		Address temporaryaddress =new Address(12, "987656", "ts", "hyd");
		Address currentaddress =new Address(1, "768489", "ap", "vizag");
		Address permanentaddress =new Address(15, "47883937", "ts", "rdm");
		
Address[] addresses = {temporaryaddress ,currentaddress,permanentaddress};
Customer customer = new Customer(122, "arha", addresses);
System.out.println(customer);
if(customer.getAddress()!=null) {
	System.out.println(Arrays.toString (customer.getAddress()));
}
	}

}
