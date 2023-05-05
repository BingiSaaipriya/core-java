package com.Interface;

public class Python implements Courses {

	@Override
	public void coursename() {
		System.out.println("the course name is:"+"python");
	}

	@Override
	public void fee() {
		System.out.println("fee of  the course:"+"30000.00");
	}

	@Override
	public void duration() {
		System.out.println(" duration of the course is:"+"5 months");
	}

	@Override
	public void timings() {
		System.out.println("the course timings is:"+"1 hour");
	}
	

}
