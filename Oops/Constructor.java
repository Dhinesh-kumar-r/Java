package Oops;

public class Constructor {
	int age;
	
	
	//default constructor
	public  Constructor() {
		age = 18;
		
	}
	
	
	//parameter constructor
	
	public Constructor(int a) {
		age=a;
	}
	
	public Constructor(Constructor obj1) {
	  age=obj1.age;
	}
	
	public static void main(String args[]) {
		
		//default paramter
		Constructor call = new Constructor();
		
		//parameter constructor calling add parameter
		Constructor obj1 = new Constructor(51);
		
		Constructor obj2 = new Constructor(obj1);
		
		System.out.println(call.age);
		System.out.println(obj1.age);
		System.out.println(obj2.age);
		
	}
}
