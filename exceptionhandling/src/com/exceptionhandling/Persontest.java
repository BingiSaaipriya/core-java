package com.exceptionhandling;

public class Persontest {
	
	public static Person[] getallpersons() {
		Person p1 = new Person(2, "honey");
		Person p2 = new Person(2,"ramu");
		Person p3 = new Person(3,"chickky");
		Person p4 = new Person(4,"charan");
	

		Person [] person = {p1,p2,p3,p4};
		for(Person pp:person) {
			System.out.println(pp);
		}
		return person;
	}
	public static void getapersonsbyid(int id) {
		Person p5 = new Person();
		p5.setid(8);
		System.out.println(p5);
		Person p1 = new Person(2, "honey");
		Person p2 = new Person(3,"ramu");
		Person p3 = new Person(4,"chickky");
		Person p4 = new Person(5,"charan");
		
		
		Person [] person = {p1,p2,p3,p4};
		Person result =null;
		for(Person pp:person) {
			if(id==pp.getid()) {
				result =pp;
			System.out.println(result);
		
	
			}
		}
		if(result==null) {
			throw new NullPointerException("person not found excepition");
			
		}
	}
	
			
public static void main(String[] args)  {
//	if(getallpersons()!=null) {
//		getallpersons();
//	}else {
//		System.out.println("no persons");
//	}
	getapersonsbyid(100);
}
}