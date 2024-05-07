package MoodleTask;
import java.util.Scanner;

public class SwapVariable {
	
	public static void main(String args[]) {
		
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a Number :");
	int a = input.nextInt();
	
	System.out.println("Enter a Number :");
	int b= input.nextInt();
	
	
	a = a+b;
	b = a-b;
	a = a-b;
	System.out.println("a is "+ a);
	System.out.println("b is " +b);
	
}
}