package com.Scanner;

import java.util.Scanner;

public class Message {
	public String personmessage() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter a name");
		String name = scanner.next();
		System.out.println("please enter age");
		int age = scanner.nextInt();
		System.out.println("please enter a salary");
		double salary = scanner.nextDouble();
		System.out.println("personname:"+name);
		System.out.println("personage:"+age);
		System.out.println("person salary:"+salary);
		return name;
		
	
		
		}
	
	public String personsof(String name,int age,double salary) {
		if(name==null || age!=20 || salary==0.0) {
			throw new IllegalAccessError("please enter proper details");
			
		}
		System.out.println("person name:"+name);
		System.out.println("person age:"+age);
		System.out.println("person salary:"+salary);
		return name;
	
	
	}

	public static void main(String[] args) {
		Message message = new Message();
		message.personmessage();
		message.personsof("priya",20,2000.00);
		try {
			message.personsof(null, 0, 0);
		}catch(IllegalAccessError ie) {
			System.out.println(ie.getMessage());
		}
		String ss ="helloeveryone";
		Scanner scanner = new Scanner(System.in);
		System.out.println("closing scanner");
		scanner.close();
		System.out.println("scanner closed");
		System.out.println(""+scanner.delimiter());
		
			

}
}
