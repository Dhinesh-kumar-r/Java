package Collectionss;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
	public static void main(String args[]) {
		Queue <String> que = new LinkedList<>();
		
		que.add("Benz");
		que.add("BMW");
		que.add("Audi");
		que.add("Maserati");
		que.add("Range Rover");
		
		System.out.println(que);
		System.out.println(que.poll());  //remove the first element and REturn
		System.out.println(que.peek());  //return the first element
		System.out.println(que.remove()); //remove the first element and return
		System.out.println(que);
		System.out.println(que.isEmpty()); //check empty
		System.out.println(que.element()); //return the first element
		System.out.println(que);
	}
}
