package com.asarelationship;

import java.util.Arrays;

public class Patient {
	private int id;
	private String name;
	private Hospital hospital;
	
	public Patient() {

	}

	public Patient(int id, String name, Hospital hospital) {
		super();
		this.id = id;
		this.name = name;
		this.hospital = hospital;
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	
	
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", hospital=" + hospital + "]";
	}

	
}
