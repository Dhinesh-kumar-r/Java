package ArrayMethod;

import java.util.Arrays;

public class ArraySort {
	public static void main(String args[]) {
		
		int arr[] = {8,11,2,33,1,6};
		
		Arrays.sort(arr);
		System.out.println(arr);
		
		for(int i : arr) {
			System.out.println(i);
		}
		
		//another method
		System.out.println(Arrays.toString(arr));
		
		
	}
}
