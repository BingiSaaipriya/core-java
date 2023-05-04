package com.MemebrInnerClass;

public class MemberOuterClass {

	private int id;
	private String name;

	void outerMethod() {
		System.out.println("outerMethod");
		id=10;
		name="SaiPriya";
		System.out.println(id);
		System.out.println(name);

	}

	static void outerStaticMethod() {
		System.out.println("outerStaticMethod");
	}

	class MemberInnerClass {

		public void innerMethod() {
			System.out.println("innermethod");
			outerMethod();

		}

	}
	
	public static void main(String[] args) {
		
		outerStaticMethod();
		
		MemberOuterClass oc=new MemberOuterClass();
		MemberOuterClass.MemberInnerClass ic = oc.new MemberInnerClass();
		
		ic.innerMethod();
		
		
	}

}
