package com.NestedInterface;

public class OuterImpl implements OuterInterface{

	@Override
	public void m1() {
		
		System.out.println("outer interface method");
		
	}
	public static void main(String[] args) {
		
		OuterImpl i=new OuterImpl();
		i.m1();
		
	}

}
