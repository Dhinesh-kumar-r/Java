package MoodleTask;
import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Word :");
		String word = input.next();
		String reverse = "";
		
		int length = word.length();
		
		for(int i =(length-1);i>=0;--i) {
			reverse =  reverse+word.charAt(i);
		}
		
		if(word.toLowerCase().equals(reverse.toLowerCase())) {
			System.out.println(word + " is a Palindrome.");
		}
		else {
			System.out.println(word + " is not a Palindrome.");
		}
		
		
	
	}
}
