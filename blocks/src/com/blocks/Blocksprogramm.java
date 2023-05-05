package com.blocks;

public class Blocksprogramm {
	static int idd=102;
	 static String name="priya";
	 double salary;
	 
	 //by using blocks
	static   {
		System.out.println("idd:"+idd);
		System.out.println("name:"+name);
		}
	//by using getin method
	public double getsalary(double salary) {
		return this.salary=salary;
		
		
		
		
	}
	public void  programm(int idd, String name){
	System.out.println(idd);
	System.out.println(name);
	System.out.println(salary);
	
	}
	public static void main(String ags[]) {
		Blocksprogramm pe=new Blocksprogramm();
		pe.programm(101,"sai");
		
		System.out.println(pe.getsalary(1000.00));
		
		
	}
	

}
