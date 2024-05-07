package Java;

public class Exception_Handling {
	public static void main(String args[]) {
		int a= 10;
		try {
			int c = a/0;
			System.out.println(c);
		}
		catch(ArithmeticException ae){
			System.out.println("error");
			
		}
		finally {
			System.out.println("finally executed"); //if catch is not required this will execute
		}
		
		System.out.println("Executed");
	}
}
