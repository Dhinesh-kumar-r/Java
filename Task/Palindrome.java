package Task;
import java.util.Scanner;



public class Palindrome {
	  public static void main(String[] args) {
		  
		  Scanner pali=new Scanner (System.in);
		  
		  System.out.println("Enter a Word :");
		  String str=pali.next();
	 String  reverseStr = "";
	    
	    int strLength = str.length();

	    for (int i = (strLength - 1); i >=0; --i) {
	      reverseStr = reverseStr + str.charAt(i);
	    }

	    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
	      System.out.println(str + " is a Palindrome String.");
	    }
	    else {
	      System.out.println(str + " is not a Palindrome String.");
	    }
}
}
