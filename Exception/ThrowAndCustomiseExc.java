package Exception;

class Custo extends Exception {
	public Custo(String message) {
		super(message);
	}
}
public class ThrowAndCustomiseExc {
	public static void main(String args[]) {
		try {
			int age = 5 ;
			if(age<0) {
				throw new Custo("age cannot be negative");
			}
			System.out.println("The Age is " + age);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
			
		}
	}
}
