package com.AnonymousInnerClass;

public abstract class AbstractClass {

	abstract void m1();

	abstract void m2();

	void m3() {
		System.out.println("m3 method");
	}
	public static void main(String[] args) {
		AbstractClass ac=new AbstractClass() {
			
			@Override
			void m2() {
				System.out.println("m2 method");
				
			}
			
			@Override
			void m1() {
				System.out.println("m1 method");
				
			}
		};
		ac.m2();
		ac.m1();
		
		
		// abstractclass$1
	}

}
