package Exception;

public class StringOutOfBoundExc {

	public static void main(String[] args) {
	
		try {
			String str = "Dhinesh";
			char c = str.charAt(8);
			System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException ex) {
			System.out.println(ex);
			System.out.println("Exception Handled");
			
		}
		
	}

}
