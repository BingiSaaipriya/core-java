package com.hasarelationship;

public class Address {
	private int id;
	private String city;
	private String zipcode;
	private String state;

	public Address() {
		super();
	}

	public Address(int id, String city, String zipcode, String state) {
		super();
		this.id = id;
		this.city = city;
		this.zipcode = zipcode;
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", zipcode=" + zipcode + ", state=" + state + "]";
	}
	
}
