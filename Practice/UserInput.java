package Practice;
import java.util.Scanner;

public class UserInput {
	public static void main(String args[]) {
		Scanner details = new Scanner(System.in);
		
		System.out.println("Enter The First Number :");
		int number1 = details.nextInt();
		
		System.out.println("Enter The Second Number :");
		int number2 = details.nextInt();
		
		int addition = number1+number2 ; 
		System.out.println("The Answer Is : " + addition);
		
		System.out.println("Enter Your Name :");
		String MyName = details.next();
	}
}
