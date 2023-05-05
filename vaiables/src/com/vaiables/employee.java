package com.vaiables;

public class employee {
	int id;
	String name;
	double salary;
	String address;
static	String companyname="infosys";
	
	
	
	public void employeedata() {
System.out.println("employee id:"+id);
System.out.println("employeename:"+name);
System.out.println("employee salay:"+salary);
System.out.println("employee address:"+address);
System.out.println("employee companyname:"+companyname);
}
	
	
	
	public static void  main(String ags[]) {
		employee details=new employee();
		details.id=1;
		details.name="saipriya";
		details.salary=2300.00;
		details.address="housingboad";
		details.employeedata();
		
		employee details2=new employee();
		details2.id=2;
		details2.name="arhasri";
		details.salary=1500.00;
		details.address="godavaikhani";
		details.employeedata();
		
		
	}
}
