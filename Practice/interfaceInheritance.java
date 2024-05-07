package Practice;

interface Dhinesh{
	abstract void method();
} 

interface Parent2 extends Dhinesh{
	abstract void method2();
}

public class interfaceInheritance implements Parent2 {


	public void method() {
		System.out.println("fields");
		
	}


	public void method2() {
		System.out.println("fields");
		
	}
			public static void main(String args[]) {
	interfaceInheritance call = new interfaceInheritance();
			call.method();
			call.method2();
}
}