package Practice;


public class MethodLoading {
	public int Mname(int a,int b) {
		return a+b;
	}
	
	public long Mname(long c,long d) {
		return c+d;
	}
	
	public static void main(String args[]) {
		MethodLoading call = new MethodLoading();
		
		int cal1 = call.Mname(10,2);
		System.out.println(cal1);
		long cal2 = call.Mname(10, 1);
		System.out.println(cal2);
	}
}
