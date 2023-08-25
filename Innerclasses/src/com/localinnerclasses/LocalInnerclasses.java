package com.localinnerclasses;

public class LocalInnerclasses {
	int a=10;
  void mm() {
	System.out.println("mm method");
}
  void methods() {
	class Inner{
		void mn() {
			System.out.println(a);
		}
		void innermethods() {
			mm();
			System.out.println("inner methods");
		}
	}
			
			
		
	
	Inner i= new Inner();
	i.innermethods();
	i.mn();
	
	
}
public static void main(String[] args) {
	LocalInnerclasses lo = new LocalInnerclasses();
	lo.methods();
	//methods();
//	
}
}
