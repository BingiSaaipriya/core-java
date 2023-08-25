package com.practiceprogram;

public class Course {
	private int id;
	private String coursename;
	private int courseperiod;
	
	public Course() {
		
	}

	public Course(int id, String coursename, int courseperiod) {
		super();
		this.id = id;
		this.coursename = coursename;
		this.courseperiod = courseperiod;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public int getCourseperiod() {
		return courseperiod;
	}

	public void setCourseperiod(int courseperiod) {
		this.courseperiod = courseperiod;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", coursename=" + coursename + ", courseperiod=" + courseperiod + "]";
	}

}
