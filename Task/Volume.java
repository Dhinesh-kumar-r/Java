package Task;

public class Volume {
	
	public double volume(double h, double b,double l) {
		return h*b*l;
	}
	
	public static void main(String args[]) {
		Volume call = new Volume();
		
		double vol = call.volume(15.5, 20.5, 30.4);
		
		System.out.println("The Volume Is " +vol);
		
}
}