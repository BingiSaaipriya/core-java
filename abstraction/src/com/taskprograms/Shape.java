package com.taskprograms;

public abstract class Shape {
	double radius;
	public Shape(double radius) {
		this.radius=radius;
		}
	//reader
	public double getradius() {
		return radius;
		}
	//writer
	public void setradius(double ra) {
		if(ra==0.0) {
			System.out.println("please enter a radius");
		}
		radius=ra;
	}
		public abstract double area();
		public abstract double volume();
	}
	


