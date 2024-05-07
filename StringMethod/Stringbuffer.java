package StringMethod;

public class Stringbuffer {

	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("welcome ");
		
//		System.out.println(str.append("Java"));
		
//		System.out.println(str.insert(2, "hello"));
		
//		System.out.println(str.delete(1, 6));
		
//		System.out.println(str.reverse());
		
//		System.out.println(str.indexOf("l"));
		
		int index = str.toString().indexOf("l");
		
		System.out.println(index);
		
//		System.out.println(str.replace(0, 1, "k"));
//		
//		System.out.println(str);
//		
		StringBuffer str2 = new StringBuffer("ab");
		System.out.println(str2.capacity());
		
	}

}
