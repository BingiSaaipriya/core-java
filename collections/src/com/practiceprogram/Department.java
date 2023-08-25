package com.practiceprogram;

public class Department {
	private int did;
	private String dname;
	private String dlocation;

	public Department() {

	}

	public Department(int did, String dname, String dlocation) {
		this.did = did;
		this.dname = dname;
		this.dlocation = dlocation;
	}

	public int getdid() {
		return did;
	}

	public void setdid(int did) {
		this.did = did;
	}

	public String dname() {
		return dname;
	}

	public void setdame(String dname) {
		this.dname = dname;
	}

	public String getdlocation() {
		return dlocation;
	}

	public void setdlocation(String dlocation) {
		this.dlocation = dlocation;
	}

	@Override
	public String toString() {

		return "Department[did=" + did + ", dname=" + dname + ",dlocation=" + dlocation + "]";
	}
}
