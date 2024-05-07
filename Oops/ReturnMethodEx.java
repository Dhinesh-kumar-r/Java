package Oops;

public class ReturnMethodEx {

	
	int Mul = 2*5 ;  //instance
	
	
	static int reMethod(int a,int b) {
		return a*b;                          //local
	}
	
	public static void main(String args[]) {
		ReturnMethodEx ex = new ReturnMethodEx();
		int answer = ex.reMethod(2, 5);
		System.out.println(answer);
	
		System.out.println(reMethod(10,5));
		
		System.out.println(ex.Mul);  
		 
		
	}
	
}
