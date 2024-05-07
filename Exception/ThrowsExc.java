package Exception;

public class ThrowsExc {
	
	public static void myMethod()throws Exception{
		int a  = 8/0; throw new ArithmeticException();
	}
	public static void main(String args[]) {
		try {
			myMethod();
		}
		catch(Exception e) { 
			System.out.println(e);
		}
	}
}
