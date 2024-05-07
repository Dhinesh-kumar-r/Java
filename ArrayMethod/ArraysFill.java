package ArrayMethod;

import java.util.Arrays;

public class ArraysFill {
	public static void main(String args[]) {
		
		int arr[]= new int[5];
		
		Arrays.fill(arr, 10);
		
		arr[3]= 2001;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
}
