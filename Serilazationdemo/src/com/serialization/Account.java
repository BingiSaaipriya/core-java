package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int acno;
	private String acname;
	private double balance;
	private  transient int charges;
	private  transient String profilepw;
	
	public Account() {
		
	}

	public Account(int acno, String acname, double balance, int charges, String profilepw) {
		super();
		this.acno = acno;
		this.acname = acname;
		this.balance = balance;
		this.charges = charges;
		this.profilepw = profilepw;
	}

	public int getAcno() {
		return acno;
	}

	public void setAcno(int acno) {
		this.acno = acno;
	}

	public String getAcname() {
		return acname;
	}

	public void setAcname(String acname) {
		this.acname = acname;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getCharges() {
		return charges;
	}

	public void setCharges(int charges) {
		this.charges = charges;
	}

	public String getProfilepw() {
		return profilepw;
	}

	public void setProfilepw(String profilepw) {
		this.profilepw = profilepw;
	}

	@Override
	public String toString() {
		return "Account [acno=" + acno + ", acname=" + acname + ", balance=" + balance + ", charges=" + charges
				+ ", profilepw=" + profilepw + "]";
	}
public static void main(String[] args) throws IOException, ClassNotFoundException {
	Account account = new Account(35678466, "priya", 2000, 15, "priya8654");
	System.out.println(account);
	FileOutputStream fos = new FileOutputStream("account.ser");
	ObjectOutputStream oos= new ObjectOutputStream(fos);
	oos.writeObject(account);
	oos.flush();
	oos.close();
	
	FileInputStream fis = new FileInputStream("account.ser");
	ObjectInputStream ois = new ObjectInputStream(fis);
	//try {
		Object obj=ois.readObject();
		Account account2 = (Account) obj;
		System.out.println(account2);
//	} catch (ClassNotFoundException e) {
		//e.printStackTrace();
	}
	}
//}
