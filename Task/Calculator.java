package Task;



public class Calculator {

	public int MethodName(int a,int b) {
		return a+b;
	}
	
	public double MethodName(double c,double d) {
		return c-d;
	}
	
	public float MethodName(float e,float f) {
		return e*f;
	}
	
	
	
	public static void main(String args[]) {
		Calculator call = new Calculator();
		
	int add = call.MethodName(10, 20);
	double sub = call.MethodName(2.0, 30.0);
	float mul = call.MethodName(100.0F, 10.0F);
	
	System.out.println(add);
	System.out.println(sub);
	System.out.println(mul);
	}
}
