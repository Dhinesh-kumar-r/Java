package Java;
import java.util.Scanner;

public class Elseif {
	public static void main(String args[]) {
		
		Scanner myObj=new Scanner(System.in);
		
		System.out.println("Enter a unit :");
		int unit=myObj.nextInt();
		
	
		
		
		System.out.println("Enter Unit Price :");
		int unitprice = myObj.nextInt();
		
		int price= unit*unitprice ; 
		System.out.println("The Amount is : "+price);
		
		if(price >200) {
			System.out.println("Pay the bill");
		}
		
		else {
			System.out.println("Free Current");
		}
		
	}
}
