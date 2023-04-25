package com.constuctors;

public class Example2 {
	
	int id;
	String firstname;
	String lastname;
static	String institute="creaeiq";
	double fee;
	
	public Example2(int id,String firstname) {
	this.id=id;
	this.firstname = firstname;
	}
	public  String getlastname(String lastname) {
		return this.lastname=lastname;
	}
	
	public String getinstitute(String institute) {
		return this.institute=institute;
	}
	
	public double getfee(double fee) {
		return this.fee=fee;
		
	}
	
	
public void constructor() {
	System.out.println(id);
	System.out.println(firstname);
	System.out.println(lastname);
	System.out.println(institute);
	System.out.println(fee);
}
	public static void main(String args[]) {
		Example2 constructor=new Example2 (1,"priya");
		constructor.constructor();
		System.out.println(constructor.getlastname("sai"));
	constructor.constructor();
	
	System.out.println(constructor.getfee(2300.00));
	constructor.constructor();
}
	
}
	
	

