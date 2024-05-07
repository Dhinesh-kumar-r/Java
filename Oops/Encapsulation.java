package Oops;


class Mobile{
	private int price;
	
	public void setDetail(int price) {
		this.price = price;
	}
	
	public int getDetails() {
		return price;
	}
}

public class Encapsulation {
	public static void main(String args[]) {
		Mobile call = new Mobile();
		
		call.setDetail(100);
	System.out.println(call.getDetails());

						
	}
}
