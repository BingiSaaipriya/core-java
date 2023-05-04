package com.cloning;

public class Employee implements Cloneable {
	private  int id;
	private  String name;
	private  double salary;
	
	public Employee(int id ,String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
public int getid() {
	return id;
}
public void setid(int id) {
	this.id=id;
}
public String getname() {
	return name;
}
public void setname(String name) {
	this.name=name;
	}
public double getsalary() {
	return salary;
}
public void setsalary(double salary) {
	this.salary=salary;
}
@Override
public String toString() {
	return "Employee[id="+id+",name="+name+",salary="+salary+"]";
}
public static void main(String[] args) throws CloneNotSupportedException {
	Employee employee = new Employee(22,"shyam",30000.00);
	System.out.println(employee);
Employee clonedEmployee = (Employee)employee.clone();
System.out.println(clonedEmployee);

employee.setsalary(23000.00);
System.out.println(employee);
System.out.println(clonedEmployee);
}
}
