package Java;
import java.util.Scanner;

public class NestedForLoop {
	public static void main(String args[]) {
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter No");
		int n=myObj.nextInt();
		
		for(int i=1;i<=n;i++) { //outer loop print row;
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}y  
}
