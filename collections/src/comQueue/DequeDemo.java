package comQueue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
	public static void main(String[] args) {
		Deque<Integer> tokens = new LinkedList<>();
		tokens.add(35);
		tokens.add(36);
		tokens.addLast(30);
		tokens.offerLast(31);
		tokens.addFirst(32);
		tokens.offerFirst(33);
		tokens.offer(34);
System.out.println(tokens);
System.out.println(tokens.getFirst());
System.out.println(tokens.peekFirst());
System.out.println(tokens.getLast());
System.out.println(tokens.peekLast());
System.out.println(tokens.pollFirst());
System.out.println(tokens.getFirst());

		
		
	}

}
