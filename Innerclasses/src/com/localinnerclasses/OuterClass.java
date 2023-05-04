package com.localinnerclasses;

public class OuterClass {
	
	
	//outerclass.class
	//outerclass$innerclass.class
	
	void m1OuterMethod() {
		System.out.println("m1OuterMethod");
		
	}
	
	
	
	void outermethod() {
		
		class InnerClass{
			
			void innerMethod() {
				System.out.println("innerMethod");
				m1OuterMethod();
				
			}
			
		}
		
		InnerClass ic=new InnerClass();
		ic.innerMethod();
		
	}
	public static void main(String[] args) {
		OuterClass oc=new OuterClass();
		oc.outermethod();
	}
	

}
