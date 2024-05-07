package Array;

public class ArrayInitialize {
		public static void main(String args[]) {
			
			
			int num [][]= {{1,2,3},{4,5,6},{7,8,9}};
			
			num[0][0] = 1 ;
			num[0][1] = 2 ;
			num[0][2] = 3 ;
			
			num[1][0] = 4 ;
			num[1][1] = 5 ;
			num[1][2] = 6 ;
			
			num[2][0] = 7 ;
			num[2][1] = 8 ;
			num[2][2] = 9 ;
			
			for(int i = 0 ;i <num.length;i++) {
				for(int j=0; j<num[i].length;j++) {
					System.out.print(num[i][j]+ " ");
				}
				System.out.println();
			}
			
		
		}
}
