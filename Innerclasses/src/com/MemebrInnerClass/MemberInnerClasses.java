package com.MemebrInnerClass;

import java.lang.reflect.Member;

import com.MemebrInnerClass.MemberInnerClasses.innermethod;

public class MemberInnerClasses implements Data {
	
	private int id;
	private String name;
	
	public void outermethod() {
		
		id=101;
		name="honey";
		System.out.println(id);
		System.out.println(name);
		System.out.println("outer method");
		
	}
	static void staticmethod() {
		System.out.println("static method");
	}
class innermethod{
	
	void inner() {
		System.out.println("inner method");
		outermethod();
		
		
	}
}
	class inners{
		void inner2() {
			System.out.println("inner22 method");
			outermethod();
		}
		
	}
	


void outermethod2() {
	System.out.println("outer123");
}
public static void main(String[] args) {
	MemberInnerClasses min= new MemberInnerClasses();
	//MemberInnerClasses.innermethod kkk = min.new innermethod();
	//kkk.inner();
	MemberInnerClasses.inners sss = min.new inners();
	sss.inner2();
	min.m1();
	min.m2();
	
	
	staticmethod();

}
@Override
public void m1() {
	System.out.println("m1 method");
	
}
@Override
public void m2() {
	System.out.println("m2 method");
	
	
}


}
