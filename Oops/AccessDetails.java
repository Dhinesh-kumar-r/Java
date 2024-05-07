package Oops;

public class AccessDetails {

	public static void main(String args[]) {
		
		AccountDetails ac = new AccountDetails();
		
		System.out.println("Customer Name :"+ac.CustomerName);
		System.out.println("Account Number :"+ ac.AccountNumber);
		System.out.println("IFSC Number :"+ac.ifsc);
		
		ac.setPawword("Dhinesh123");
		ac.setPin(2001);
		
		System.out.println(ac.getPassword());
		System.out.println(ac.getPin());
		
		
	}
}
