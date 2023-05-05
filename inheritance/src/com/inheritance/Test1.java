package com.inheritance;

public class Test1 extends Student {
	public void dd() {
		System.out.println(" aa");
	}
	public static void main(String[] args) {
		Student bb=new Student();
		bb.id=101;
		bb.address="ramagundam";
		bb.address();
		bb.firstname="priya";
		bb.name();
		bb.id();
		bb.fee=22000.00;
		bb.fee();
	}

}
