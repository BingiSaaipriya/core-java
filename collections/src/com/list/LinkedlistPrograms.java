package com.list;

import java.util.LinkedList;

public class LinkedlistPrograms {
	public static void main(String[] args) {
		LinkedList< String> names = new LinkedList<>();
		names.add("priya");
		names.offerLast("shyam");
		names.add("lalitha");
		names.addLast("priyanka");
		names.offerFirst("rohith");
		names.add("spoorthi");
		names.addFirst("chinnu");
		
	System.out.println(names);
		
//		System.out.println(names.getFirst());
//		System.out.println(names);
//		System.out.println(names.getLast());
//		System.out.println(names);
//		System.out.println(names.peek());
//		System.out.println(names);
//		System.out.println(names.poll());
//		System.out.println(names);
//		System.out.println(names.peekFirst());
//		System.out.println(names);
//		System.out.println(names.peekLast());
//		System.out.println(names);
//		System.out.println(names.poll());
//		System.out.println(names);
//		System.out.println(names.pollLast());
//		System.out.println(names);
		System.out.println(names.remove());
		System.out.println(names.removeFirst());
		System.out.println(names.removeLast());
	}

}
