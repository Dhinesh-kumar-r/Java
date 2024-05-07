package Java;

public class WideningTypeCasting {
	public static void main(String args[]) {
		int number = 20;
		float convert = number;
		
		//widening
		
		double dbl =100.99;
		int converting =(int)dbl;
		
		System.out.println(convert);
		System.out.println(converting);
		
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
