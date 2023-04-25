package com.constuctors;

public class Example {
	


	public void area(double area) {
double area1=Math.pow(area, 4);		
System.out.println(area);
System.out.println("area of square:"+area);

	}
	
	public int area(int length, int width) {
	int areaofrectangle=length*width;
		return areaofrectangle;
	
}
	public double area(float radius) {
	double area=Math.PI*(radius*radius);
	return area;
	}
	
	
	
	public static void main(String args[]) {
		Example area=new Example();
		 area.area(20);
		 
		 Example area1=new Example();
		 area1.area(20,30);
		 
		 
		 
	}
}

