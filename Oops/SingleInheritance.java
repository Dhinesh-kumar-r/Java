package Oops;

class Parent{
		int age=21;
		void behaviourAll() {
			System.out.println("This is a Parent");
		}
	}
	
class Child extends Parent{
		int child = 2;
		void childbehave() {
			System.out.println("Child");
		}
	}
	
	public class SingleInheritance {
	
		public static void main(String args[]) {
		
			Child call = new Child();
		
				System.out.println(call.age);
				System.out.println(call.child);
		
				call.behaviourAll();
				call.childbehave();
	}
}
