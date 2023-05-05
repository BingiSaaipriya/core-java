package com.vaiables;

public class Methodoverloading {
	
	int id;
	String name;
	double  salary;
	public void m1(int id) {
	System.out.println(id);
	}
public void m1(int id,String name) {
	System.out.println(id);
	System.out.println(name);
}
	public void m1(String name,double salary) {
		System.out.println(name);
		System.out.println(salary);
	}
	
	public void m1(int id,String name,double salary) {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}	

	public static void main(String args[]) {
		Methodoverloading dd=new Methodoverloading();
		dd.m1(1,"sai");
		dd.m1("arha",23000.00);
		dd.m1(1,"sai");
		dd.m1(1,"arha",23000.00);
		
	}
	}
	



