package com.exampleprograms;

public class Circleprogram {
	private static int pow;

	public static void main(String[] args) {
		float radius,circumferences,diameter,area;
		radius=2;
		circumferences=2*3.14f*radius;
		diameter=2*radius;
		area=3.14f*radius*radius;
		System.out.println("diameter of circle:"+diameter);
		System.out.println("circumference of circle:"+circumferences);
		System.out.println("area of circle:"+area);
		
		float cm,meter,kilometer;
		cm=1000;
		meter=10;
		kilometer=100;
		cm=meter/cm;
		kilometer=meter/cm;
		System.out.println(cm);
		System.out.println(meter);
		System.out.println(kilometer);
		
		float celsius,fahrenheit;
		celsius=100;
		fahrenheit=(celsius*9/5)+32;
		System.out.println("temperature of fahrenheit:"+fahrenheit);
		
		fahrenheit=200;
		celsius=(fahrenheit+32)*5/9;
		System.out.println("temperature of celsius:"+celsius);
		
		int base,expo;
		base=2;
		expo=5;
		pow=6;
		System.out.println("power of base:"+base);
		System.out.println("power of expo:"+expo);
		System.out.println("result="+Math.pow(2,5));
		
		float principle,time,rate,simpleinterest;
		principle=1200;
		time=2;
		rate=5;
		simpleinterest=(principle*time*rate)/100;
		System.out.println("simple interest:"+principle*time*rate);
		System.out.println("simple interest principle:"+principle);
		System.out.println("simple interest time:"+time);
		System.out.println("simple interest of rate:"+rate);
		
		
		
		
	}

}
