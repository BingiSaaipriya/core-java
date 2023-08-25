package com.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector vector = new Vector();
		System.out.println(vector.capacity());
		vector.addElement("white");
		vector.addElement("red");
		vector.addElement("green");
		vector.addElement("black");
//		if(vector.contains("orange")) {
//			System.out.println(vector);
//		}else {
//			System.out.println("no colour");
//		}
//		vector.addElement(11);
//		vector.addElement(null);
//		vector.addElement(11.22);
//		vector.addElement(null);
//		vector.addElement('e');
//		vector.addElement("tdyuid");
//		vector.addElement(30000);
//		vector.add('a');
		System.out.println(vector.capacity());
	System.out.println(vector.size());
		System.out.println(vector);
		
		
		Enumeration elements = vector.elements();
		while(elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
		}
//		Iterator iterator = vector.iterator();
//		while (iterator.hasNext()) {
//			Object next = iterator.next();
//			String color = (String) next;
//			if (color.equals("black"))
//				System.out.println(color);
//
//		}
		System.out.println("**********************************");

		for (Object object1 : vector) {
			String color = (String) object1;
			if (color.equals("black"))
				System.out.println(color);
		}

		Vector vector2 = new Vector();
		vector2.addElement(10);
		vector2.addElement(20);
		vector2.addElement(30);
		vector2.addElement(40);
		int sum = 0;
		for (Object object : vector2) {
			Integer value = (Integer) object;
			sum = sum + value;
		}
		System.out.println("**********************************");
		System.out.println(sum);

		Vector vector3 = new Vector(vector);
		vector3.add(vector2);
		System.out.println(vector3);
}
}
