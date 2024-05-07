package Java;
import java.util.Scanner;
public class HelpMonkey {
	public static void main(String args[]) {
		 Scanner myObj = new Scanner(System.in);
		{
			System.out.println("Enter A Time:");
			double time = myObj.nextInt();
			
			if(time >= 7 && time <= 12) {
				System.out.println("This Time Is Safe ");
			}
			else if(time >=13 && time <= 18) {
				System.out.println("This Time Is Danger");
			}
			else if(time >=19 && time <=24) {
				System.out.println("This Time Is Safe");
			}
			
			else if(time >=1 && time <= 6) {
				System.out.println("This Time Is Danger");
			}
			
			else 
			{
				System.out.println("Choose Correct time");
			}
			
		}
		
		
	}
}
