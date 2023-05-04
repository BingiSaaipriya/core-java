package com.clonemethods;

public class Customertest {
	public static void main(String[] args)  throws CloneNotSupportedException{
		Address address = new Address(11, "hyd", "ts", "9987599");
		Order order = new Order(222,"in progrees");
		System.out.println(address);
		Customer customer = new Customer(1, "arha",address,order);
		System.out.println(customer);
		Customer ClonedCustomer =(Customer)customer.clone();
		System.out.println(ClonedCustomer);
		System.out.println("********************");
		customer.setname("sri");
	customer.getaddress().setcity("pune");
		customer.getaddress().setstate("mah");
		customer.getOrderstatus().setOrderstatus("delivered");
			System.out.println(customer);
			System.out.println(ClonedCustomer);
}
}