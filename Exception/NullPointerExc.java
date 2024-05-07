package Exception;

public class NullPointerExc {

	public static void main(String[] args) {
		
		
		try {
			String name = null;
			System.out.println(name.length());
		}
		//catch(Exception ex)
		catch(NullPointerException ex) {
			System.out.println(ex);
			System.out.println("Error Handled");
		}
		

	}

}
