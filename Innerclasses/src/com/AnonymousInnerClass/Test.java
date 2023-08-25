package com.AnonymousInnerClass;

public class Test {
	public static void main(String[] args) {
		AnnonymousClasses aaa = new AnnonymousClasses() {
			
			@Override
			void outermethod() {
				System.out.println("outer method");
			}
			
			@Override
			void mm() {
			System.out.println("mm method ");	
				
			}
			
			@Override
			void innermethods() {
				System.out.println("inner method");
				
			}
		};
		aaa.innermethods();
		aaa.mm();
		aaa.outermethod();
	}

}
