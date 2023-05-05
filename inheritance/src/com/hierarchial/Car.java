package com.hierarchial;

public class Car extends Vechicle {
		@Override  //annotations
		public void start() {
			System.out.println("car starts");
		}
		private void stops() {
			System.out.println("car stops");

		}
		@Override
		public void breaks() {
		System.out.println("car breaks");
			
		}
		@Override
		public void engine() {
			System.out.println("car engine");
		}
		public static void main(String[] args) {
			Car car=new Car();
			car.stops();
			car.breaks();
			car.engine();
			car.start();
			
		}

		
	}



