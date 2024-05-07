package Practice;

class Shop{
	void products() {
		System.out.println("Id Name");
	}
}

class Laptop extends Shop{
	void id() {
		System.out.println("101");
	}
}


class Mobile extends Shop{
	void ids() {
		System.out.println("201");
	}
}

public class HybridInhetritance {
	public static void main(String args[]) {
		
		Mobile call =  new Mobile();
		Laptop call1 =  new Laptop();
		
		call.ids();
		call1.id();
		
	}
}
