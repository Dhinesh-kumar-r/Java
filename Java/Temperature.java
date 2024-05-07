package Java;
import java.util.Scanner;

public class Temperature {
	public static void main(String args[]) {
		Scanner Temp = new Scanner(System.in);
		
		System.out.println("Enter A Temperature :");
		int temp=Temp.nextInt();
		
		if(temp >=20 && temp <=30) {
			System.out.println("Temperature is Normal");
		}
		
		else if(temp >=30) {
			System.out.println("Temperature Very Hot");
		}
		
		else if(temp <= 20) {
			System.out.println("Temperature is Very Chill");
			
		}
		
		else {
			System.out.println("Choose A Current Temperature");
		}
	}
}
