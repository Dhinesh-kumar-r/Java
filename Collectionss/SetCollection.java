package Collectionss;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetCollection {
	public static void main(String args[]) {
		//set does not support duplcate value this using hashinh function
		
		Set <Integer> st= new HashSet<>(); //hashing function
		st.add(2);
		st.add(10);
		st.add(44);
		st.add(5);
		st.add(44);
		System.out.println(st);
		
		Set <Integer> st1 = new LinkedHashSet<>(); //Save IN Queue
		st1.add(77);
		st1.add(22);
		st1.add(55);
		st1.add(33);
		st1.add(22);
		System.out.println(st1);
		
		SortedSet<Integer> st2 = new TreeSet<>(); //save in sorting
		st2.add(55);
		st2.add(22);
		st2.add(4);
		st2.add(5);
		st2.add(44);
		System.out.println(st2);
		System.out.println(st2.contains(55));
		System.out.println(st2.first());
		System.out.println(st2.last());
	}
}
