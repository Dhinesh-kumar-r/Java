package Collectionss;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLIsts {
	public static void main(String args[]) {
		
		
		//Integer
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(10);
		arr1.add(20);
		arr1.add(30);
		System.out.println(arr1);
		System.out.println(arr1.size());
	
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("apple");
		arr.add("banana");
		arr.add("orange");
		arr.add("strawberry");
		
		System.out.println(arr);
		System.out.println(arr.size());
		System.out.println(arr.get(2));
		System.out.println(arr.set(2, "mango"));
		System.out.println(arr);
		
		Iterator<String> obj = arr.iterator() ;
		while(obj.hasNext()) {
			System.out.println(obj.next());
		}
		
		
		//object
		ArrayList<Object> myobj = new ArrayList<>();
		myobj.add("hai");
		myobj.add(10);
		myobj.add("dhinesh");
		
		System.out.println(myobj);
		
		Iterator<Object> ob = myobj.iterator();
		while(ob.hasNext()) {
			System.out.println(ob.next());
		}
	}
}
