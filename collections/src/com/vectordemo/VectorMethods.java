package com.vectordemo;

import java.util.Vector;

public class VectorMethods {
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<>(); 
		//Add method
		v1.add(100);
		v1.add(200);
		v1.add(300);
		v1.add(400);
		v1.add(500);
		System.out.println(v1);
		v1.add(2,900);
		System.out.println(v1);
		Vector<String> ss = new Vector<>();
		ss.add("a");
		ss.add("s");
		ss.add("j");
		ss.add("k");
		System.out.println(ss);
		if(ss.contains("q")) {
			System.out.println("print letter");
		}else {
			System.out.println("no letter ");
				
			}
		//Add All method
		Vector<String> s1 = new Vector<>();
		s1.add("python");
		s1.add("java");
		System.out.println(s1);
		Vector<String> vec= new Vector<>();
		vec.add("php");
		vec.add("android");
		System.out.println(vec);
		s1.addAll(0, vec);
		System.out.println("final vector list:"+s1);
		
		//Add Element method
		Vector<Integer> i = new Vector<>();
		i.add(10);
		i.add(20);
		i.add(30);
		i.add(40);
		System.out.println(i);
		i.addElement(60);
		System.out.println(i);
		
		//capacity
		Vector<Integer> c= new Vector<>(3);
		c.add(21);
		c.add(22);
		c.add(33);
		System.out.println("Default capacity is:"+c.capacity());
		c.add(44);
		System.out.println("c:"+c.capacity());
		
		//Clear method
		Vector<String> vv = new Vector<>();
		vv.add("e");
		vv.add("p");
		vv.add("s");
		System.out.println("Element of vector is:"+vv);
		vv.clear();
		System.out.println("Element of vector afterclear:"+vv);
		
		//Contains Method
		
		Vector<Integer> aa= new Vector<>();
		aa.add(44);
		aa.add(99);
		aa.add(44);
		aa.add(67);
		System.out.println("Existence :"+aa.contains(44));
		System.out.println("Existence:"+aa.contains(100));
		
		
			
		}
		
	
	
	}


