package com.aggregation;

public class Emoloyee {
	private int id;
	private String name;
	private double salary;
	private Leavetracker leavetracker;
	
	public Emoloyee() {
	}

	public Emoloyee(int id, String name, double salary, Leavetracker leavetracker) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.leavetracker = leavetracker;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Leavetracker getLeavetracker() {
		return leavetracker;
	}

	public void setLeavetracker(Leavetracker leavetracker) {
		this.leavetracker = leavetracker;
	}

	@Override
	public String toString() {
		return "Emoloyee [id=" + id + ", name=" + name + ", salary=" + salary + ", leavetracker=" + leavetracker + "]";
	}

}
