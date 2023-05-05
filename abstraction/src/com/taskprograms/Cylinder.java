package com.taskprograms;

public class Cylinder extends Shape{
	double height;
	public Cylinder(double height,double radius) {
		super(radius);
		this. height=height;
	}
	@Override
	public double area() {
		
		return 2*Math.PI*super.getradius()*this.height+2*Math.pow(super.getradius(),2);
	}
	@Override
	public double volume() {
		return Math.PI*Math.pow(super.getradius(),2)*this.height;
	}
	//reader
	public double getHeight() {
		return height;
		}
	
	//writer
	public void setHeight(double height) {
		this.height=height;
	}
	

}
