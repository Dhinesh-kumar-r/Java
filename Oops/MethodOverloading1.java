package Oops;

public class MethodOverloading1 {
	
	static int Method(int a,int b) {
		return a+b;
	}
	
	static double Method(double a,double b) {
		return a+b;
	}
	
	static float Method(float a,float b) {
		return a+b;
	}
	
	
	public static void main(String args[]) {
		
		int val = Method(10,20);
		double val1 = Method(50.3D,50.2D);
		float val2 =Method(101.1F,0.9F);
		
		System.out.println(val);
		System.out.println(val1);
		System.out.println(val2);
	}
}
