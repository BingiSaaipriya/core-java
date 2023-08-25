package com.accessmodifiers;

import accessmodifiers.Employee;

public class Emp extends Employee {
private	int id;
private String name;
private	double salary;

protected Emp() {
	System.out.println("default constructor");
	
}
public void test() {
	System.out.println("test");
}

public void setName(String name) {
	this.name=name;
	
}
protected void protect() {
	System.out.println("pro");
}
public void disp() {
	System.out.println(id);
	System.out.println(name);
	System.out.println(salary);
}
	
	public static void main(String[] args) {
		Emp ee=new Emp();
		
		ee.id=1;
	//	ee.setName("");
		ee.disp();
		Employee e=new Emp();
        e.display();
        
		}

}
