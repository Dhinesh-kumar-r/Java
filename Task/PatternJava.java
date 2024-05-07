package Task;
import java.util.Scanner;
public class PatternJava {
		public static void main(String args[]) {
			Scanner call=new Scanner(System.in);
			
//			System.out.println("Enter a Number");
//		int i,j,k, row=call.nextInt();
//			
//			
//			
//			for(i=1;i<=row;i++) {
//				for(j=1;j<=row;j++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
			
			System.out.println("Enter a Number");
			int input=call.nextInt();
			
			
			for(int i=0;i<input;i++) {
				for(int j=1;j<=input;j++) {
					int ans=i+j>input ? i+j-input :i+j;
					System.out.print(ans);
				}
				System.out.println();
			}
			
	}
}
