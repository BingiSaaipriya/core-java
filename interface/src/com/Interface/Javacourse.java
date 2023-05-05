package com.Interface;

public class Javacourse  implements Courses
{

	@Override
	public void coursename() {
System.out.println(" the course name is:"+"java");		
	}

	@Override
	public void fee() {
		System.out.println(" fee of java course:"+"25000.00");		
	}

	@Override
	public void duration() {
		System.out.println("course duration :"+"6 to 7 months");		
	}

	@Override
	public void timings() {
		System.out.println("timings of the course:"+"2 hours");		
	}

}
