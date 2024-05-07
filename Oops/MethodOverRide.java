package Oops;

class ParentClass{
	void myMethod() {
		System.out.println("Parent");
	}
}

public class MethodOverRide extends ParentClass {
	void myMethod() {
		super.myMethod();
		System.out.println("Child");
	}
	
	
	public static void main(String args[]) {
		MethodOverRide call = new MethodOverRide();
		
		call.myMethod();
	}
}
