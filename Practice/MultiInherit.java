package Practice;

class GrandParent{
	void grandParentMethod() {
		System.out.println("Hello");
	}
	
}

class Parent extends GrandParent{
	void parentMethod() {
		System.out.println("World");
	}
}

class Child extends Parent{
	void childMethod() {
		System.out.println("Welcome");
	}
}

public class MultiInherit {
	public static void main(String args[]) {
		Child call = new Child();
		call.grandParentMethod();
		call.parentMethod();
		call.childMethod();

	}
}
