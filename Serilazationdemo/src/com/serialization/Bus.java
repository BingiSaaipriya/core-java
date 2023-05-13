package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Bus implements Serializable{
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private int busno;
	private String busname;
	private int charges;
	private String startdes;
	private String enddes;
	
//	public Bus() {
//		
//	}

	public Bus(int busno, String busname, int charges, String startdes, String enddes) {
		super();
		this.busno = busno;
		this.busname = busname;
		this.charges = charges;
		this.startdes = startdes;
		this.enddes = enddes;
	}

	public int getBusno() {
		return busno;
	}

	public void setBusno(int busno) {
		this.busno = busno;
	}

	public String getBusname() {
		return busname;
	}

	public void setBusname(String busname) {
		this.busname = busname;
	}

	public int getCharges() {
		return charges;
	}

	public void setCharges(int charges) {
		this.charges = charges;
	}

	public String getStartdes() {
		return startdes;
	}

	public void setStartdes(String startdes) {
		this.startdes = startdes;
	}

	public String getEnddes() {
		return enddes;
	}

	public void setEnddes(String enddes) {
		this.enddes = enddes;
	}

	@Override
	public String toString() {
		return "Bus [busno=" + busno + ", busname=" + busname + ", charges=" + charges + ", startdes=" + startdes
				+ ", enddes=" + enddes + "]";
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Bus b= new Bus(234, "orange", 500, "gdk", "hyd");
		System.out.println(b);
		FileOutputStream fos= new FileOutputStream("bus.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(b);
		oos.flush();
		oos.close();
		
		
		FileInputStream fis = new FileInputStream("bus.ser");
		ObjectInputStream ois =new ObjectInputStream(fis);
		Object obj =ois.readObject();
	Bus b2 = (Bus) obj	;
	System.out.println(b2);
	}
}
