package com.Scanner;

import java.util.Scanner;

public class Accounttest {
	
//		try {
//			account.deposit(2000.00);
//			account.balanceenquiry();
//		}catch(InvalidAmount ie) {
//		}try {
//			account.deposit(0.00);
//	
//			}catch(Exception e) {
//				System.out.println("please enter a valid amount");
//			}
//	}
	public static void main(String[] args) throws Exception  {
		Account account = new Account(123444,"priyanka",3000.00);
	
	Scanner scanner = new Scanner(System.in);
	String option=" ";

do {
		System.out.println("choose one option");
		System.out.println("1.deposit");
		System.out.println("2.withdraw");
		System.out.println("3.balanceEnquiry");
		
	
		System.out.println("enter here");
		option = scanner.next();
		switch(option) {
		case "1":{
			System.out.println("enter deposit amount:");
			String  s= scanner.next();
			double balance=Double.parseDouble(s);
	account.deposit(balance);
	account.balanceenquiry();
	break;
		}
	
		case "2":{
			System.out.println("enter withdraw amount:");
			String s = scanner.next();
			double amount = Double.parseDouble(s);
			account.withdraw(amount);
			//double result=
		//	System.out.println(result);
			account.balanceenquiry();
			break;
		}
		
		case "3": {
			account.balanceenquiry();
			break;
		}
		default:
			System.out.println(" invalid option");
			break;
		}
		System.out.println("do you want to continue: (yes/no)");
		option = scanner.next();
	} while (option.equalsIgnoreCase("yes"));
	}
}
			
		
	
		
	

		
	
		
		

		
	
	

	
	
	
	


