package com.staticnested;

public class StaticNested {
	
	private int id;
	
	static void outerStaticmethod() {
		System.out.println("static method");
	}
	
	void nonStaticMethod() {
		System.out.println("nonStatic method");
	}
	
	static class  InnerClass{
		
		void m3() {
			System.out.println("non static  method");
			outerStaticmethod();
			
		}
		static void m4() {
			System.out.println("static method");
		}
		
	}
	
	public static void main(String[] args) {
		StaticNested sn=new StaticNested();
		sn.nonStaticMethod();
		StaticNested.InnerClass.m4();
		InnerClass ic=new InnerClass();
		ic.m3();
		
		
		
		
		
	}

	
	

}
