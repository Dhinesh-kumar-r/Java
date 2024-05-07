package Collectionss;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeues {

	public static void main(String[] args) {
		
		Deque<Integer>deq = new ArrayDeque<>();
		deq.add(12);
		deq.addFirst(55);
		
		deq.addLast(105);
		deq.addLast(100);
		System.out.println(deq);
		System.out.println(deq.removeFirst()); //remove the first elemet
		System.out.println(deq.offer(2001)); // add item
		System.out.println(deq.offerFirst(101)); ///add last
		System.out.println(deq.offerLast(10000)); //add first
		System.out.println(deq); 
	
		
	}

}
