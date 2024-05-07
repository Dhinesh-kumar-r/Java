package Collectionss;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {
	public static void main(String args[]) {
		Map<String,Integer> map = new TreeMap<>();
		
		map.put("Zebra",1);
		map.put("Lion" ,2);
		map.put("Elephant", 15);
		map.put("apple", 11);
		System.out.println(map.keySet());
		System.out.println(map.get("Zebra")); //get the key name
		
		for(Map.Entry<String,Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
