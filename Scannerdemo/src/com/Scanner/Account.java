package com.Scanner;

public class Account {
	private int acno;
	private String acname;
	private double balance;
	public Account() {
		
	}
	
	public Account (int acno,String acctname,double balance) {
		this.acno=acno;
		this.acname=acname;
		this.balance=balance;
	}
public void deposit(double amount) throws Exception  {
	if(amount<=0) {
		System.out.println("invalid amount ,please enter above zero account");
		throw new Exception("invalid amount,please deposit min amount");
	}
	this.balance=amount;
}
	public double withdraw(double amount) throws Exception  {
		if(amount<=0) {
			System.out.println("invalid amount");
			throw new Exception("invalid amount,please deposit min amount");
		}
		if (balance<=0) {
			throw new Exception("insufficient funds");
		}
		balance =balance -amount;
		return balance;
		}
	public void balanceenquiry() {
		System.out.println(this.balance);
	}
	public int getacno() {
		return acno;
	}
	public String getacname() {
		return acname;
	}
	public void Setname(String acname) {
		this.acname=acname;
	}
	public double getbalance() {
		return balance;
	}
	public void setbalncw() {
		this.balance=balance;
	}
	
	public String toString() {
		return "Account[acno="+acno+",acname="+acname+",balance="+balance+"]";
	}
	public static void main(String[] args) throws Exception {
		Account account = new Account();
		account.acno=3393878;
		account.acname="shyam";
		account.balance=0.0;
		account.Setname("arha");
		System.out.println(account);
		System.out.println(account.hashCode());
		System.out.println(account+" "+account.getacno());
		System.out.println(account+"  "+account.getacname());
		System.out.println(account+" "+account.getbalance());
		Account account1= new Account(233674, "priyanka", 0.0);
		System.out.println(account);
		
		
	}
}

