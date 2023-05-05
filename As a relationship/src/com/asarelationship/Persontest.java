package com.asarelationship;

public class Persontest {
	public static void main(String[] args) {
		Address dhoniaddress = new Address(1,"hyd","ts","678368") ;
		Address sakshiaddress =new Address(1,"ts","jarqand","765460")	;
		System.out.println(dhoniaddress);
		System.out.println(sakshiaddress);
		Person sakshi = new Person(100, "sakshi",sakshiaddress);
		Person person = new Person(1, "dhoni", dhoniaddress, sakshi);
		System.out.println(sakshi);
		System.out.println(person);
	}

}

