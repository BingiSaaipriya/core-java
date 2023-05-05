package com.asarelationship;

public class Address {
	private int id;
	private String Zipcode;
	private String state;
	private String city;
	
	public Address() {
		super();
		
	}

	public Address(int id, String zipcode, String state, String city) {
		super();
		this.id = id;
		this.Zipcode = zipcode;
		this.state = state;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getZipcode() {
		return Zipcode;
	}

	public void setZipcode(String zipcode) {
		Zipcode = zipcode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", Zipcode=" + Zipcode + ", state=" + state + ", city=" + city + "]";
	}
	
	

}
