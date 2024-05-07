package Exception;

public class NumberFormatExc {

	public static void main(String[] args) {
			
		
		try {
			String str = "five";
			int convert = Integer.parseInt(str);
			System.out.println(convert);
		}
		catch(NumberFormatException ex) {
			System.out.println(ex);
			System.out.println("Exception Handled");
		}
		
	}
		

}
