package Array;

import java.util.Scanner;

public class UserArray {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Array Size");
		
		int array= input.nextInt();
		int a[]= new int[array];
		
		System.out.println("Enter Array Element");
		
		for(int i =0;i<array;i++) {
			a[i]=input.nextInt();
		}
		
		int max = a[0];  // 1 2 3 4
		
		for(int i =0;i<array;i++) {
			if(max < a[i]) {
				max= a[i];
			}
			
		}
		System.out.println(max);
	}
}
