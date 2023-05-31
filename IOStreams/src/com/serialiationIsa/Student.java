package com.serialiationIsa;

public class Student extends Person{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String email;
	private String course;
	private String password;
	
	public Student() {
		
	}

	public Student(int id, String firstname, String lastname, int age,String email,String password,String course) {
		super(id, firstname, lastname, age);
		this.email = email;
		this. course = course;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [email=" + email + ", course=" + course + ", password=" + password + ", getId()=" + getId()
				+ ", getFirstname()=" + getFirstname() + ", getLastname()=" + getLastname() + ", getAge()=" + getAge()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	

}
