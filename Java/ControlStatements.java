package Java;
import java.util.Scanner;


public class ControlStatements 
{
	public static void main(String args[]) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter Your Weight : ");
		
		int weight=myObj.nextInt();
		if(weight >=50) {
			System.out.println("Your are Eligible To Donate A blood");
			
		}
		else {
			System.out.println("You are not Eligible");
		}
		
		
	}
	
	

}
