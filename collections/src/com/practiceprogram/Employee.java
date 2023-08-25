package com.practiceprogram;

public class Employee {
	private int eid;
	private String ename;
	private double esalary;
	private Department department;

	public Employee() {

	}

	public Employee(int eid, String ename, double esalary, Department department) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.department = department;
	}

	public int geteid() {
		return eid;
	}

	public void seteid(int eid) {
		this.eid = eid;
	}

	public String getename() {
		return ename;
	}

	public void setename(String ename) {
		this.ename = ename;
	}

	public double getesalary() {
		return esalary;
	}

	public void setsalary(double esalary) {
		this.esalary = esalary;
	}

	public Department getDepartment() {
		return department;

	}

	public void setDepartmenet(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {

		return "Employee[id=" + eid + ",enDame=" + ename + ",esalary=" + esalary + ",department=" + department + "]";
	}

}
