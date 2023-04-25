package com.hashcode;
import java.awt.Image;

import java.io.Serializable;

public  final class Myimmutable implements Comparable <Myimmutable>,CharSequence,Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private int id;

 
 private final String name;
 
 public Myimmutable (int id, String name) {
	 this.id=id;
	 this.name=name;
 }
 public int getId() {
	return id;

}
public String getName() {
	return name;
}

public String toString() {
	return "Student[id="+id+",name="+name+"]";
}









	public static void main(String[] args) {
		Myimmutable dd=new Myimmutable(1, "priya");
		System.out.println(dd);
	}
	@Override
	public int length() {
		
		return 0;
	}
	@Override
	public char charAt(int index) {
		
		return 0;
	}
	@Override
	public CharSequence subSequence(int start, int end) {

		return null;
	}
	@Override
	public int compareTo(Myimmutable o) {
		
		return 0;
	}
	}


