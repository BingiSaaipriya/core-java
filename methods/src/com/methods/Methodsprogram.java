package com.methods;

public class Methodsprogram {
	//without returntype and without parameter
	public void  area() {
		double length=15.00;
		double width=12.00;
		double areaofrectangle=(length*width);
		System.out.println("area of rectangle:"+areaofrectangle);
	}
	//with returntype and without parameter
	
	public static double amount() {
		double cash=1000.00;
		return cash;
		}
	public static byte aa() {
		byte score=99;
		return score;
	}
	
	public static float temp() {
		float temperature=39.1f;
		return temperature;
	}
	
	
	
		//with returntype and with parameter
	public static String persons(String firstperson,String secondperson) {
		return firstperson+" "+secondperson;
	}

	//without returntype and with parameter
	public void area1(double length,double width) {
		double areaofrectangle=(length*width);
		System.out.println("areaofrectangle:"+areaofrectangle);
		
		
		
	}
	
	
	
	
	
	public static void main(String arrgs[]) {
		Methodsprogram area=new Methodsprogram();
		area.area();
		System.out.println(Methodsprogram.amount());
		System.out.println(Methodsprogram.aa());
		String persons=Methodsprogram.persons("shyam",  "arha");
		System.out.println(persons);
		System.out.println(Methodsprogram.persons("priya", "meghana"));
		
		Methodsprogram area1=new Methodsprogram();
		area.area1(10,20);
		
		System.out.println(Methodsprogram.temp());
	}
	
	

}
