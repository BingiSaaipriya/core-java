package com.sortting;

public class Customer implements Comparable<Customer>{
	private int id;
	 private String firstname;
	 private String lastname;
	 private String address;

	public Customer() {
		super();

	}

	public Customer(int id, String firstname, String lastname, String address) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
	}



	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getfirstName() {
		return firstname;
	}

	public void stefirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getlastname() {
		return lastname;
	}

	public void setlastname(String lastname) {
		this.lastname = lastname;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;

	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", address=" + address
				+ "]";
	}
	


	@Override
	public int compareTo(Customer c) {
		
		//- to
		
		return c.firstname.compareTo(this.firstname);
	}
	
	
	
	
	

}
