package Task;

public class Pattern {
	public static void main(String args[]) {
		
//RIGHT ANGLE TRIANGLE
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//LEFT ANGLE TRIANGLE
		int row=6;
		for(int i=0;i<row;i++) {
			for(int j=2*(row-i);j>=0;j--) {
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		//pyramid
		
		for(int i=1;i<=row;i++) {
			for(int j=row-i;j>1;j--) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	
		
		
		
	}
}
