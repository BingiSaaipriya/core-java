package com.asarelationship;

public class Hospital {
	private int id;
	private String city;
	private String  hospitalname;
	private double fee;
	
	public Hospital() {
		
	}

	public Hospital(int id, String name, String hospitalname, double fee) {
		super();
		this.id = id;
		this.city= city;
		this.hospitalname = hospitalname;
		this.fee = fee;
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

	public void setName(String city) {
		this.city =city;
	}

	public String getHospitalname() {
		return hospitalname;
	}

	public void setHospitalname(String hospitalname) {
		this.hospitalname = hospitalname;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", city=" + city + ", hospitalname=" + hospitalname + ", fee=" + fee + "]";
	}
	
	

}
