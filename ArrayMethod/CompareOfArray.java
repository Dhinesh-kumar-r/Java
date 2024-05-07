package ArrayMethod;

import java.util.Arrays;

public class CompareOfArray {
	public static void main(String args[]) {
		
		String fruit[] = {"Apple","Banana","orange"};
		
		String fruit1[] = {"Apple","Banana","orange"};
		
		int comp = Arrays.compare(fruit, fruit1);
		
		System.out.println(comp);
		
		
	}
}
