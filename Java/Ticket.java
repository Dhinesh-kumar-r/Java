package Java;
import java.util.Scanner;
public class Ticket {
	public static void main(String args[]) {
		Scanner myObj = new Scanner(System.in);
		
		
		
		System.out.println("Enter Your Age :");
		int age = myObj.nextInt();
		
		if(age<=12) {
			System.out.println("You Have 30% Discount");
		}
		
		else if(age >=60) {
			System.out.println("You Have 50% Discount ");
		}
		
		else {
			System.out.println("The Price Is Regular");
		}
		
	}
}
