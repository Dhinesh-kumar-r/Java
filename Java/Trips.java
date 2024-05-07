package Java;
import java.util.Scanner;


public class Trips {
	public static void main(String args[]) {
		
		Scanner call = new Scanner(System.in);
		
		System.out.println("---Welcome to Magic SPA---");
		
		System.out.println("Enter Your Age :");
		int age = call.nextInt();
		
		int silveramount =5000 ;
		int goldamount = 7000;
		int platinumdiscount =10000;
		
		int silver = (15*silveramount) / 100;
		int gold = (15*goldamount) / 100;
		int platinum= (15*platinumdiscount)/100;

	
		
		if(age >=18) {
			
			System.out.println("Enter Your Membership : (yes/no)");
			String status = call.next();
			
			if(status.equals("yes")) {
				
				System.out.println("Enter Your Membership : (silver/gold/platinum)");
				String membership = call.next();
				
				
				if(membership.equals("silver")) {
					System.out.println("you save :" +silver);
				}
				
				else if(membership.equals("gold")) {
					System.out.println("you save :" + gold);
				}
				
				else if(membership.equals("platinum")) {
					System.out.println("you save :" + platinum);
				}
			}
			
			else {
				System.out.println("You have 5 % discount");
			}
			
			
			
				}
		else {
				System.out.println("You Are Under 18");
			}
		
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
