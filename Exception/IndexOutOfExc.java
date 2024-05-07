package Exception;

public class IndexOutOfExc {
	public static void main(String args[]) {
		
		
		try {
//			int a[] = new int[4];
//			a[5] = 11;
//			System.out.println(a[5]);
			int num[] = {76,95,85,65,53};
			System.out.println(num[5]);
		}
		catch(IndexOutOfBoundsException ex) {
			System.out.println(ex);
			System.out.println("ErrorHandled");
		}
		
	}
}
