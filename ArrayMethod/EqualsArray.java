package ArrayMethod;

import java.util.Arrays;

public class EqualsArray {
	public static void main(String args[]) {
		
		
		String color[] = {"blue","yellow","red"};
		
		String colors[]= {"blue","yellow","red"};
		
		System.out.println(color == colors);  /// the == check reference only so the each array save in different storage the output will be false
		
		System.out.println(Arrays.equals(color, colors));
	}
}
