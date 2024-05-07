package Practice;


public class TypeCasting {
	public static void main(String args[]) {
		
		//widening small to high
		int smaller = 100;
		float higher = smaller;
		System.out.println(higher);
		
		//Narrow high to low 
		
		double floatvalue = 100.50;
		int converted = (int)floatvalue;
		System.out.println(converted);
		
		char charvalue = 'D';
		int intvalue = (int)charvalue;
		System.out.println(intvalue);
		
		
	}
}
