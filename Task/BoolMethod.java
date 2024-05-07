package Task;

public class BoolMethod {

	
	boolean booMethod(int m1,int m2,int total) {
		int marks =  m1+m2;
		return marks>total;
	}
	
	public static void main(String args[]) {
		BoolMethod call = new BoolMethod();
		
		boolean result = call.booMethod(70, 100, 160);
		
		if(result) {
			System.out.println("You are Eligible ");
		}
		else {
			System.out.println("Not Eligible");
		}
	}
}
