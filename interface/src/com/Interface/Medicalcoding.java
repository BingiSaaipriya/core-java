package com.Interface;

public class Medicalcoding implements Courses {

	@Override
	public void coursename() {
		System.out.println("the course name is:"+"medicalcoding");
	}

	@Override
	public void fee() {
		System.out.println("the course fee is:"+"30000.00");
	}

	@Override
	public void duration() {
		System.out.println(" duration of the course  is:"+"3 months");
	}

	@Override
	public void timings() {
		System.out.println("the course timings is:"+"1 hour");
	}

}
