package com.needofcollection;

public class BeforeCollection {
	public static void main(String[] args) {
		int[]  numbers = new int[3];
		numbers[0]=1;
		numbers [1]=2;
		numbers[2]=3;
		//numbers[3]=4;
		int oldCapacity= numbers.length;
		int newCapacity = oldCapacity * 3 / 2 + 1;
		System.out.println(newCapacity);
		Employee employee = new Employee();
		Object[] objects = new Object[10];
		// Heterogeneous
		// add edit allows oragazination 
			objects[0] = 1;
			objects[1] = 10.12;
			objects[2] = 'c';
			objects[3] = "hello";
			objects[4] = employee;
			System.out.println(objects);
	}
	
	

}
