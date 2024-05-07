package Java;

public class InstanceVariable {
String name = "Dhinesh" ;
	
	void method() {
		System.out.println("Method");
	}
			
			public static void main (String args[]) {
			InstanceVariable call = new InstanceVariable();
			
			System.out.println(call.name);
	}
}
