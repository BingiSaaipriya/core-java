package com.cloningmethods;

public class Employee implements Cloneable {
	private int id;
	private String firstname;
	private String lastname;
	private double salary;
	private Address address;
	
	public Employee(int id,String firstname,String lastname,double salary,Address address) {
		super();
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.salary=salary;
		this.address=address;
		}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id=id;
		}
	public String getfirstname() {
		return firstname;
		}
	public void setfirstname(String firstname) {
		this.firstname=firstname;
	}
	public String getlastname() {
		return lastname;
	}
	public void setlastname(String lastname) {
		this.lastname=lastname;
		}
	public double getsalary() {
		return salary;
	}
	public void  setsalary(double salary) {
		this.salary=salary;
}
	
	public Address getaddress() {
		return address;
	}
	public void setaddress(Address address) {
		this.address=address;
	}
	public String toString() {
		return "Employee[id="+id+",firstname="+firstname+",lastname="+lastname+",salary="+salary+".Address="+address+"]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Employee Cloned=(Employee) super.clone();
		Cloned.setaddress((Address)Cloned.getaddress().clone());
		return Cloned;
	
	
}
}
