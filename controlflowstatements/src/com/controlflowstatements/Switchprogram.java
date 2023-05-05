package com.controlflowstatements;

public class Switchprogram {
	public static void main(String[] args) {
		int weekday=5;
		switch (weekday) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
			default:
				System.out.println("please enter a valid weekday");
				System.out.println("-------------");
		}
		
		int number=20;
		switch(number) {
		case 10:
			System.out.println("10");
		case 20:
			System.out.println("20");
			break;
			default:
				System.out.println(" not in 10, 20 or 30");
		}
		
		String penname="cello";
		switch(penname) {
		case "parker":
		System.out.println("penid=101"+" "+"penname=parker"+" "+"pencolour=black"+" "+"penprice=12.00");
		break;
		case "cello":
			System.out.println("penid=102"+" "+"penname=cello"+" "+"pencolour=brown"+" "+"penprice=15.00");
			break;
			default:
				System.out.println("please enter a valid penanme");
		}
		
	}
}


