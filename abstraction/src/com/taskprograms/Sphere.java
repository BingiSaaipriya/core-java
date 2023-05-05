package com.taskprograms;

public class Sphere extends Shape {
	public Sphere(double radius) {
		super(radius);
	}

	@Override
	public double area() {
		return 4*Math.PI*Math.pow(super.getradius(),2);
	}

	@Override
	public double volume() {
		return (4/3)*Math.PI*Math.pow(super.getradius(),3);
	}
	

}
