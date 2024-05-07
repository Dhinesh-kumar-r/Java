package Java;
import java.util.Scanner;


public class UserInput {
	public static void main(String args[]) {
		
		Scanner myDetails=new Scanner(System.in);
	System.out.println("Bio Data");
		
			System.out.println("Enter Your Name :");
			String name= myDetails.next();
			
			
			System.out.println("Enter Your Age :");
			int age = myDetails.nextInt();
			
			System.out.println("Enter Your Qualification :");
			String degree = myDetails.next();
			
			System.out.println("Enter Your E-Mail id");
			String mail = myDetails.next();
			
			System.out.println("Enter Your Aadhar Number :");
			int aadhar = myDetails.nextInt();
			
			
			System.out.println("Enter Your Address :");
			
			String state = myDetails.nextLine();
			String city = myDetails.nextLine();
			String no = myDetails.nextLine();
			String extra =myDetails.nextLine();
			
			
			System.out.println("Enter Your Number :");
			
			int number = myDetails.nextInt();			
			
			
			
			
		
	}
}
