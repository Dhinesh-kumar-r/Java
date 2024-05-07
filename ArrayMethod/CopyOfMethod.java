package ArrayMethod;

import java.util.Arrays;

public class CopyOfMethod {
	public static void main(String args[]) {
		
		int arr[] = new int[4];
		
		
		
		for(int i : arr) {
			System.out.println(i);
		}
		
		System.out.println();
		int arr2[]=Arrays.copyOf(arr, 4);
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(i);
		}
	}
}
