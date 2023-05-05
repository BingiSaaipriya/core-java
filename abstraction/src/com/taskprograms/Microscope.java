package com.taskprograms;

public class Microscope extends Labrequirements{

	int magnification;

	static final int MIN_MAGNIFICATION = 1;

	public Microscope(String manufacturer, String model, int year, int magnification) {
		super(manufacturer, model, year);
		setMagnification(magnification);
	}

	public int getMagnification() {
		return magnification;
	}

	public void setMagnification(int magnification) {
		if (magnification < MIN_MAGNIFICATION) {
			System.out.println(" Magnification must be greater than or equal to the minimum magnification");
		}
		this.magnification = magnification;
	}

	@Override
	public String performMaintenance() {
		return "Clean the lenses and check the light source.";
	}
}


