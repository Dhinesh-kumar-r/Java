package Java;
import java.util.Scanner;

public class Multipication {
	public static void main(String args[]) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("enter A Number Mutiply :");
		
		int mul=myObj.nextInt()	;
		
		for(int i=1; i<=10;i++) {
			System.out.println(i + "x" +mul+ "="+(i*mul));
		}
	}
	
}
