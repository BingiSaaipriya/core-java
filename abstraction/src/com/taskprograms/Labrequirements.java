package com.taskprograms;

public  abstract class Labrequirements {

		String manufacturer;
		String model;
		int year;

		static final int MIN_YEAR = 1950;

		public Labrequirements(String manufacturer, String model, int year) {
			setManufacturer(manufacturer);
			setModel(model);
			setYear(year);
		}

		public String getManufacturer() {
			return manufacturer;
		}

		public void setManufacturer(String manufacturer) {
			if (manufacturer == null || manufacturer.isBlank()) {
				System.out.println("Manufacturer cannot be null or blank");
			}
			this.manufacturer = manufacturer;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			if (model == null || model.isBlank()) {
				System.out.println("Model cannot be null or blank");
			}
			this.model = model;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			if (year < MIN_YEAR) {
				System.out.println("like Year must be greater than or equal to the minimum year");
			}

			this.year = year;
		}

		public abstract String performMaintenance();

	}

