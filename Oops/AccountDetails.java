package Oops;

public class AccountDetails {
	
	String CustomerName = "Dhinesh Kumar";
	int AccountNumber = 767733737;
	String ifsc = "IOBA1123";
	
	private String password ;
	private int pin  ;
	
	public void setPawword(String password) {
		this.password=password;
	}
	
	public void setPin(int pin) {
		this.pin=pin;
	}
	
	
	public String getPassword() {
		System.out.println();
		System.out.println("Warning");
		return password;
	}
	
	public int getPin() {
		System.out.println();
		System.out.println("Warning");
		return pin;
	}
	
	
}
