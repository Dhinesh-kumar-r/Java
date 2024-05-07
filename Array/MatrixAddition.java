package Array;

import java.util.Scanner;

public class MatrixAddition {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		
		int a[][] = new int [3][3];
		int b[][]= new int [3][3];
		int c[][] = new int [3][3];
		
		
		int i,j;
		
		
		System.out.println("Enter A First Matrix :");
		
		for(i=0;i<a.length;i++) {
			for(j=0;j<a[i].length;j++) {
				
				a[i][j]= input.nextInt();
				
			}
		}
		
		
		System.out.println("Enter a Second Matrix");
		
		for(i = 0;i<b.length;i++) {
			for(j=0;j<b[i].length;j++) {
				
				b[i][j]=input.nextInt();
			}
		}
		
		System.out.println("Addition Matrix");
		
		for(i=0;i<c.length;i++) {
			for(j=0;j<c[i].length;j++) {
				c[i][j]= a[i][j]+b[i][j];
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}
