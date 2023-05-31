package comQueue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListWithQueue {
	public static void main(String[] args) {
		Queue<Integer> q1 = new LinkedList<>();
		q1.add(100);
		q1.add(200);
		q1.add(300);
		q1.add(400);
		q1.add(500);
		q1.add(600);
		//q1.offer(222);
		System.out.println("elements in queue:"+q1);
		System.out.println("elements removed from the queue:"+q1.remove());
		System.out.println(q1);
		System.out.println("head of the queue:"+q1.element());
		System.out.println(q1);
		System.out.println(" head of the queue:"+q1.peek());
		System.out.println(q1);
		System.out.println("returned head of the queue:"+q1.poll());
		System.out.println("final queue:"+q1);
		System.out.println(q1.offer(111111));
		
	
	
	}

}
