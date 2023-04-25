package com.hashcode;

import java.util.Objects;

public class Student {
	private int id;
	private String name;
	
	public Student() {
		
	}


public Student(int id,String name) {
	this.id=id;
	this.name=name;
	}

@Override
public int hashCode() {
	return Objects.hash(id, name);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return id == other.id && Objects.equals(name, other.name);
}


public int getid() {
	return id;
}
public void setid(int id) {
	this.id=id;
}
public String getname() {
	return name;
}
public void setname(String name) {
	this.name=name;
}
public String toString() {
	return "student[id="+id+",name="+name+"]";
}
public static void main(String[] args) {
	Student student=new Student(1,"sai");
	Student student2=new Student(1,"sai");
	System.out.println(student==student2);
	System.out.println(student.equals(student2));
	System.out.println(student.hashCode());
	System.out.println(student2.hashCode());
	
	String s5="ea";
	String s6="fb";
	System.out.println(s5.hashCode());
	System.out.println(s6.hashCode());
	System.out.println(s5.equals(s6));
	reverse("helloworld");
}
public static void reverse(String input) {
	String reverse="";
	for(int i=input.length()-1;i>=0;i--) {
		reverse=reverse+input.charAt(i);
	}
	System.out.println(reverse);
}
}
