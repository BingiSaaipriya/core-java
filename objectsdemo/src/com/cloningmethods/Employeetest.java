package com.cloningmethods;

public class Employeetest {
	public static void main(String[] args) throws CloneNotSupportedException{
		Address address = new Address("rdm", "ts", "9764789");
		Employee employee = new Employee(11, "arha", "sri", 40000.00, address);
		System.out.println(employee);
		Employee emp2 =(Employee)employee.clone();
		System.out.println(emp2);
		employee.setid(44);
		employee.getaddress().setState("ap");
		employee.getaddress().setCity("delhi");
		System.out.println(employee);
		System.out.println(emp2);
	}

}