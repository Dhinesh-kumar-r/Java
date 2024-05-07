package StringMethod;

public class StringMethod {
	public static void main(String args[]) {
		
		String name = "Dhinesh";
		String myName = "dinesh";
		
		System.out.println(name.charAt(2));  //find the index using character
		//System.out.print(name.compareTo(myName));  //find the two variable are equal if not equal it return the asc number and subtract the number
													//if value are missing returns the missing number count
		
		System.out.println(name.compareToIgnoreCase(myName));  //its ignore the case sensitive
		
		System.out.print(name.concat(myName)); // addd the two variable
		
		
		char[] charArr = name.toCharArray();
		
		for (char e : charArr) {
			System.out.println(e);;   //its split the words in single
		}
		
		System.out.println(name.contains("d")) ; // to check the variable contains given word if there return true else  return false
		
		System.out.println(name.endsWith("h")); // check the the last is there or not
		
		System.out.print(name.);;
		
	}
}
