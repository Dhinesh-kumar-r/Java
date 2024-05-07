package Practice;

abstract class name{
	abstract void method();
}

public class Abstarct extends name {
	 void method() {
		System.out.println("dhinesh");
	}
	
	public static void main(String args[]) {
		Abstarct call = new Abstarct();
		call.method();
	}
}
