package Oops;

public class VoidMethodEx {
	int salary=1000;  //instance
	
	void voidMethod() { //local
		
		
		System.out.println("Hello World");
	}
	
	static String Name = "Dhinesh";  //static
	
	
	
	
	public static void main(String args[]) {
		VoidMethodEx call = new VoidMethodEx();
		
		call.voidMethod();
		System.out.println(call.salary);
		
		System.out.println(Name);
	}
}
