package com.accessmodifiers;

public class Employee {
private	int id;
private String name;
private	double salary;

protected Employee() {
	System.out.println("default constructor");
	
}
public void test() {
	System.out.println("test");
}

public void setName(String name) {
	this.name=name;
	
}
public void disp() {
	System.out.println(id);
	System.out.println(name);
	System.out.println(salary);
}
	
	public static void main(String[] args) {
		Employee ee=new Employee();
		ee.id=1;
	//	ee.setName("");
		ee.disp();
		
		}

}
