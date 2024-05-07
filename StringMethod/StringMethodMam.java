package StringMethod;

public class StringMethodMam {
		public static void main(String args[]) {
			
			//Length find a length of a string
			
			String alphabets = "abcdefghijklmnopqrstuvwxyz" ;
			System.out.println(alphabets.length());
			
			//UpperCase
			String name = "dhinesh" ;
			System.out.println(name.toUpperCase());
			
			//LowerCase
			String myName = "DHINESH" ; 
			System.out.println(myName.toLowerCase());
			
			//Index off
			String content = "I am a Developer" ; 
			System.out.println(content.indexOf("a"));
			
			String StringName = new String ("hello");
			String meaning = new String(" ");
			
			System.out.println(meaning.isEmpty());  //take space also
			System.out.println(meaning.isBlank());  //didnt take a space
			
			System.out.println(StringName.substring(0,3)); //get a value from give number
			
			System.out.println(StringName.endsWith("h")); //the given char is end with true or false
			
			System.out.println(StringName.concat(content)); //add two variables
			
			System.out.println(StringName.replace("hello", "hai"));
			
//			System.out.println(StringName.charAt("a"));
			
			String char1 = "dhinesh";
			String char2 = "   dhinesh" ;
			System.out.println(char1.equals(char2));
			
			String world = "world \"needs\" \"peace\" for" ;  //high light the sentetnce
			System.out.println(world);
			
			String w1 = "it\'s wierd";  //single quotes
			System.out.println(w1);
			
			String w2 = "thw world   //  is hurting" ;
			System.out.println(w2);   // single slash
			
			System.out.println(Math.max(100, 5));
			
			System.out.println(Math.min(100, 3));
			
			System.out.println(char2);
			System.out.println(char2.trim()); //remove front and end space
			
			
			
		
			
			
		}
		
}
