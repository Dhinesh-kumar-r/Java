package Java;
import java.util.Scanner;

public class Time {
	public static void main(String args[]) {
		Scanner time =  new Scanner(System.in);
		
		System.out.println("Enter a time :");
		int traintime = time.nextInt();
		
		if(traintime >= 0 && traintime <=4) {
			System.out.println("The Train there in trichy");
		}
		
		else if(traintime >=5 && traintime <=8) {
			System.out.println("The Train There in Madurai");
		}
		
		else if(traintime >=9 && traintime <=12) {
			System.out.println("The Train There in Kadalur");
		}
		
		else if(traintime >=13 && traintime <=16) {
			System.out.println("The Train There in chennai");
		}
		
		else if(traintime >=17 && traintime <=20) {
			System.out.println("The Train There in Salem at :");
		}
		
		else if(traintime >=20 && traintime <=24) {
			System.out.println("The Train There in Coimbatore");
		}
		
		else {
			System.out.println("Enter a correct time");
		}
		
		
		
	}
}
