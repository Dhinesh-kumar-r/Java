package Oops;



class Shop{
	int time = 12;
	
	void open() {
		System.out.println("50 % offer" );
	}
	
}

class Apple extends Shop{
	
	int price =  100;
	void taste() {
		System.out.println("Apple Color is Red");
	}
}

class Banana extends Shop{
	
	int amount = 50;
	
	void behave() {
		System.out.println("Banana Color Is Yellow");
	}
}






public class HierachicalInheritance {
	public static void main(String args[]) {
		
		Apple call = new Apple();
	
		call.open();
		call.taste();
		
		
		System.out.println(call.time);
		System.out.println(call.price);
		
		System.out.println();
		
		Banana  ban = new Banana();
		
		ban.open();
		ban.behave();
		
		System.out.println(ban.time);
		System.out.println(ban.amount);
		
	}
}
