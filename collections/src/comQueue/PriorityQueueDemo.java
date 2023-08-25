package comQueue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Integer> numbers = new PriorityQueue<>();
		numbers.add(20);
		numbers.add(30);
		numbers.add(50);
		numbers.add(40);
		numbers.add(10);
		numbers.add(50);
		numbers.add(null);
		
		System.out.println(numbers);
		System.out.println(numbers.peek());
		System.out.println(numbers);
		System.out.println(numbers.poll());
////		System.out.println(numbers.poll());
//System.out.println(numbers);
//System.out.println(numbers.contains(50));
//System.out.println(numbers.contains(1000));
//System.out.println(numbers.offer(20));
//System.out.println(numbers.remove(10));
//System.out.println(numbers.remove(300));
//System.out.println(numbers.retainAll(numbers));
//System.out.println(numbers.size());
//		
		
		
		
		
		
		
	}

}
