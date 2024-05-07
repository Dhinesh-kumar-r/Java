package Collectionss;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
	public static void main(String args[]) {
		
		Queue <String> obj = new PriorityQueue<>();
		obj.add("Zebra");
		obj.add("Apple");
		obj.add("Banana");
		obj.add("banana");
		
		System.out.println(obj); // print alphabet wise
		
		Queue <Integer> obj1 = new PriorityQueue<>();
		obj1.add(12);
		obj1.add(120);
		obj1.add(22);
		obj1.add(10);
		System.out.println(obj1);
		
		
		
	}
}	
