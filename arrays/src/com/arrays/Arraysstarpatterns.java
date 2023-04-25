package com.arrays;

public class Arraysstarpatterns {
	public static void main(String[] args) {
		int size=5;
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.println("*");
				}
			System.out.println();
		}
		System.out.println( );
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<size-1;j++) {
				System.out.println("*");
				}
			System.out.println();
		}
		System.out.println();
	}

}
