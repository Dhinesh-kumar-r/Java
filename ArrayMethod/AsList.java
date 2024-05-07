package ArrayMethod;

import java.util.Arrays;
import java.util.List;

public class AsList {
	public  static void main(String args[]) {
		
		String mobile[] = {"Samsung","Apple","Vivo","Redmi"};
		
		List <String> output = Arrays.asList(mobile);
		
		System.out.println(output);
		
		for(String mo : mobile) {
			System.out.println(mo);
		}
	}
}
