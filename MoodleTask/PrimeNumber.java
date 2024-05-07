package MoodleTask;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[]) {
		   Scanner input = new Scanner(System.in);
		   
		   System.out.println("Enter a Number :");
		  int n = input.nextInt(); 
		  
		   if(n==1) {
			   System.out.println(n + " Its Not a prime number");
			   return;
		   }
		   
		   for(int i=2;i<n;i++) {
			   if(n % i == 0) {
				   System.out.println(n+ " Its Not a Prime Number");
				   return;
			   }
		   }
		   
		  
			   System.out.println(n + " Its A prime Number");
		
		   
	}
}
