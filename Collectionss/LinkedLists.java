package Collectionss;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLists {
	public static void main(String args[]) {
		
		//integer
		LinkedList<Integer>arr = new LinkedList <>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		
		System.out.println(arr);
		System.out.println(arr.size());
		System.out.println(arr.get(2));
		System.out.println(arr.set(2,100));
		System.out.println(arr.remove(4));
		System.out.println(arr);
		
		//String
		
		LinkedList<String>arr1 = new LinkedList<>();
		arr1.add("USA");
		arr1.add("Russia");
		arr1.add("China");
		arr1.add("Germany");
		arr1.add("Malaysia");
		
		System.out.println(arr1);
		System.out.println(arr1.size());
		System.out.println(arr1.get(0));
		System.out.println(arr1.set(0, "India"));
		System.out.println(arr1);
		
		Iterator<String> add =  arr1.iterator();
		while(add.hasNext()) {
			System.out.println(add.next());
		}
		
	}
}
