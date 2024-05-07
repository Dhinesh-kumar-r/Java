package Oops;

public class MethodOverloading {
	
	
	public int MethodName(int a,int b) {
		return a+b;
	}
	
	public long MethodName(long c,long d) {
		return c+d;
	}
	
	public float MethodName(float e,float f) {
		return e+f;
	}
	
	public static void main(String args[]) {
		MethodOverloading call = new MethodOverloading();
		
	int val = call.MethodName(10, 20);
	float val1 = call.MethodName(20.2F, 30.3F);
	int val2 = call.MethodName(100, 100);
	
	System.out.println(val);
	System.out.println(val1);
	System.out.println(val2);
	}

}
