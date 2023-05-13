package com.bufferedobjectsfile;

public class Address {
	private String state;
	private int pincode;
	
	public  Address() {
		
	}

	public Address(String state, int pincode) {
		super();
		this.state = state;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [state=" + state + ", pincode=" + pincode + "]";
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}
