package Oops;



abstract class Food{
	
	abstract void blackForest();
	
	void flavour() {
		System.out.println("ice cream");
	}
	
	
}

	public class Abstaction extends Food {
		void blackForest() {
			System.out.println("butter,cream,strawbery");
		}
		
		public static void main(String args[]) {
		
		Abstaction call = new Abstaction();
		call.blackForest();
		call.flavour();
	}
}