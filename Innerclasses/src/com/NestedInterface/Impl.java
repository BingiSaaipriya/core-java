package com.NestedInterface;

public class Impl  implements OuterInterface.innerInterface{

	@Override
	public void m2() {
		System.out.println("inner interface method");
		
	}
	public static void main(String[] args) {
		
		Impl ic=new Impl();
		ic.m2();

	}
	

}
