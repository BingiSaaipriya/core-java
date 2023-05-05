package com.aggregation;

public class Employeetest {
	public static void main(String[] args) {
	Leavetracker leavetracker = new Leavetracker(3, 10, 90, 7);
	Emoloyee employee = new Emoloyee(1, "sss",30000.00, leavetracker);
	System.out.println(employee);
		
	}

}
