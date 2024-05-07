package Oops;

interface Health{
	abstract void define();
}

interface Wealth extends Health{
	abstract void method();
}

public class Interface implements Wealth  {
	
	public void define(){
		System.out.println("definition");
	}
	
	public void method() {
		System.out.println("Method");
	}
	
	public static void main(String args[]) {
		Interface call = new Interface();
		
		call.define();
		call.method();
		
		
	}
}
