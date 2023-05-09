package com.Scanner;

import java.util.Scanner;

public class REctangle {
	
	
	public double area() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter a length");
		double length=scanner.nextDouble();
		System.out.println("please enter a width");
		double width=scanner.nextDouble();
		double area=length*width;
		System.out.println("area of rectangle:"+area);
		return area;
	}
	
//	public double areaof(double length,double width) throws Exception {
//		if(length==0.0 || width==0.0) {
//			throw new Exception("please enter the values");
//		}
//		double area=length*width;
//		System.out.println("area of rectangle:"+area);
//		return area;
//		
//		}
//	
	public static void main(String[] args) throws Exception {
		REctangle rectangle = new REctangle();
		rectangle.area();
	//rectangle.areaof(10, 20);
//		try {
//			rectangle.areaof(0,0);
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("please enter a message");
//		String msg= scanner.next();
//		System.out.println(msg);
//		rectangle.area();
//	
//	
//		

	
	}
}
