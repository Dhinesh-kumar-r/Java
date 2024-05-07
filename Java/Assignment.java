package Java;
import java.util.Scanner;

public class Assignment {
	public static void main(String args[])
	{
		Scanner answer = new Scanner(System.in);
		
		System.out.println("Enter Your Name : ");
		String name = answer.next();
		System.out.println("Welcom Back :" + name);
		
		
		System.out.println("Enter Number");
		
		int no1= answer.nextInt();
		int val = no1+=10;
		
		System.out.println("Answer is :" + val);
		
		int a= 100;
		int b=++a;
		int c = --a;
		System.out.println(b);
		System.out.println(c);
		
		
	}

}
