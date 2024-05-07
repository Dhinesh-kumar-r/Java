package Java;
import java.util.Scanner;


public class Arithmetic {
	
	public static void main(String args[]) {
		
	Scanner myAns = new Scanner(System.in);
	
	System.out.println("Enter A First Number :");	
	int number1 = myAns.nextInt();
	System.out.println("Enter Second Number :");
	int number2 = myAns.nextInt();
	
	int answer = number1+number2;
	System.out.println(answer);
	
	
	System.out.println("Enter A First Number :");	
	int sub1 = myAns.nextInt();
	System.out.println("Enter A Second Number :");	
	int sub2 = myAns.nextInt();
	int subanswer=  sub1-sub2;
	System.out.println(subanswer);
	
	System.out.println("Enter A First Number :");	
	int mul1 = myAns.nextInt();
	
	System.out.println("Enter A Second Number :");
	int mul2 = myAns.nextInt();
	
	int mulanswer= mul1*mul2;
	System.out.println(mulanswer);
	
	
	int div = 10/2;
	System.out.println(div);
	
	int mod = 100 % 2;
	System.out.println(mod);	
	
	//Assignment Operator
	
	
	String name = "Dhinesh";
	System.out.println("The Name is : " +name);
	
	int a=10;
	int b=20;
	a+=10;
	b-=100;
	
	System.out.println(a);
	System.out.println(b);
	
	
}
}
