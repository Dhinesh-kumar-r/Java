package Collectionss;

import java.util.Stack;

public class StackMemorys {
	public static void main(String args[]) {
		Stack <Integer> sta = new Stack<>();
		sta.push(101);
		sta.push(102);
		sta.push(103);
		sta.push(104);
		sta.push(105);
		System.out.println(sta);
		
		System.out.println(sta.pop());        // Remove first Position and Return
		System.out.println(sta.peek());       // Return First Element
		System.out.println(sta);
		System.out.println(sta.empty());      // check its empty or Not
		System.out.println(sta);
		System.out.println(sta.search(104));  // if value thre return position not there return -1 
		
	}
}
