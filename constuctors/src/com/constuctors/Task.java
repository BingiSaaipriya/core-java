package com.constuctors;

public class Task {
	
	
	
	
	
	int id;
	String firstname;
	String lastname;
	String address;
	double salary;
	
	public Task(int id, String firstname,String lastname,String address,double salary) {
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.salary=salary;
		this.address=address;
	}
	public Task(double salary,String address) {
	this.salary=salary;
		this.address=address;
	}
	public Task(String firstname,String lastname) {
		this.firstname=firstname;
		this.lastname=lastname;
	}
	
	public int getid() {
	return this.id;
	}
	
	
	public void display() {
		System.out.println("employee id:"+id);
		System.out.println("employee firstname:"+firstname);
		System.out.println("employee lastname:"+lastname);
	System.out.println("employee address:"+address);
	System.out.println("employee salary:"+salary);
}
	
	public void display2() {
		System.out.println("employee address:"+address);
		System.out.println("employee salary:"+salary);
			}
	
	
	public void display3() {
		System.out.println("employee firstname:"+firstname);
		System.out.println("employee lastname:"+lastname);
			}
	
	public static void main(String[] args) {
		
		Task tt=new Task(109, "arha", "sri","peddapalli",30000.00);
		tt.display();
		
		Task tt2=new Task(30000.00, "ramagundam");
		tt2.display2();
		Task tt3=new Task("sai","priya");
		tt3.display3();
		
		
	Task[] Ta= {tt,tt2,tt3};
		for(int i=0;i<Ta.length;i++) {
		Ta[i].display();
			}
		for (Task task : Ta) {
			task.display();
		}
	
	}
}



