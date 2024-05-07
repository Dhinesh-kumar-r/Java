package Java;

public class PrintNumbers {
public static void main(String args[]) {
	
	
	String [] letter= {"five","ten","fifteen","twenty","twenty five","thirty","thirty five","fourty","fourty five","fifty"};
	
	int num=0;
	
	for (int i=1;i<=50;i++) {
		
		
		if(i % 5==0) {
			System.out.println(letter[num]);
			num ++;
			continue;
		}
		
		
		else {
			System.out.println(i);
		}
		
		
		
		
		
	}
	
}
}
