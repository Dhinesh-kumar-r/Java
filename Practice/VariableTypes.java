package Practice;

public class VariableTypes {

	//method calling local variable
		void methodCalling() {
			String myName = "Dhinesh";
			System.out.println(myName);
		}
		
		//instance variable
			
		String City = "Trichy";
			static String name = "Dhinesh";
	


public static void main(String args[]) {
	VariableTypes call = new VariableTypes();
	call.methodCalling();
	
	System.out.println(call.City);
	System.out.println(name);
};
};