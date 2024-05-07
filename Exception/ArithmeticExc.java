package Exception;

public class ArithmeticExc {
	public static void main(String args[]) {
		try {
			int a=9/0;
			System.out.println(a);
		}
		catch(ArithmeticException ex ) {
			System.out.println(ex);
			System.out.println("Exception handled");
		}
		
	}
}
