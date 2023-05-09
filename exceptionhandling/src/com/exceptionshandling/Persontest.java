package com.exceptionshandling;

import com.exceptionhandling.Person;

public class Persontest {
	public static Person[]  getallpersons() {
		Person p1 = new Person(2,"arha");
		Person p2 = new Person(3,"sri");
		Person p3 = new Person(1,"sneha");
		Person p4 = new Person(4,"chinnu");
		
		
		Person[] person= {p1,p2,p3,p4};
		for (Person pp : person) {
			System.out.println(pp);
	}
	return person;
	}
	
	public static void getpersonbyid(int id) {
		Person p5 = new Person();
		p5.setid(5);
		System.out.println(p5);
		Person p1 = new Person(2,"arha");
		Person p2 = new Person(3,"sri");
		Person p3 = new Person(1,"sneha");
		Person p4 = new Person(4,"chinnu");
		
		Person [] person= {p1,p2,p3,p4};
		Person result =null;
		for(Person pp:person) {
			if(id==pp.getid()) {
				result=pp;
				System.out.println(pp);
			}
		
		
			}
		if(result ==null) {
			throw new PersonNotFoundException("person not found exception");
		}
	
	
	}
	public static void main(String[] args) {
//		if(getallpersons()!=null) {
//			
//		
//		getallpersons();
//		}else {
//			System.out.println("no persons");
//		}
		
		try {
			getpersonbyid(30);
		}catch(PersonNotFoundException e) {
		System.out.println(e.getMessage());
	}
}
}


