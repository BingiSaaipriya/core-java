package com.list;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack< Integer> num = new Stack<>();
//		num.add(10);
//		num.add(20);
//		num.add(30);
//		num.add(40);
//		num.add(50);
		num.push(70);
		num.push(80);
		num.push(90);
		System.out.println(num);
		//System.out.println(num.push(60));
		System.out.println(num.search(90));
		System.out.println(num.search(100));
		System.out.println(num.empty());
		System.out.println(num.push(10));
		System.out.println(num);
		System.out.println(num.pop());
		System.out.println(num);
		System.out.println(num.peek());
		System.out.println(num);
		
		
	}

}
