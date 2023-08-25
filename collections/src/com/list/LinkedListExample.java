package com.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> dailyRoutineWork = new LinkedList<>();
		dailyRoutineWork.add("take a walk with dog!!!!");
		dailyRoutineWork.addFirst("wake up and brush the teeth");
		dailyRoutineWork.add("take a break fast");
		dailyRoutineWork.add("reading book and preparing a lunch");
		dailyRoutineWork.add("going to work");
		dailyRoutineWork.offerLast("finished my work and going to home!!");
		dailyRoutineWork.addLast("going to sleep!!!");
		System.out.println(dailyRoutineWork);
//		
	
		
//			System.out.println(dailyRoutineWork.peek());
//			System.out.println(dailyRoutineWork.peekFirst());
//		System.out.println(dailyRoutineWork.getFirst());
//			System.out.println(dailyRoutineWork.peekLast());
//			System.out.println(dailyRoutineWork.getLast());
//	
//			System.out.println(dailyRoutineWork.removeFirst());
			
//			Iterator<String> iterator= dailyRoutineWork.iterator();
//			while(iterator.hasNext()) {
//				System.err.println(iterator.next());
			
		//}
			
		}

}
