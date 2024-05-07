package Array;

public class TwoDimensionArray {
	public static void main(String args[]) {
		
		String [][] mobiles = {{"Samsung","iphone","Vivo"},{"A03","iphone-15","vivo v5"}};
		mobiles[0][1]= "values";
		
		System.out.println(mobiles[0][1]);
		
		//three dimension
		
		String [][] pc = {{"lenovo","hp","acer"},{"mac","dell","vaio"},{"2200","1300","2222"}};
		System.out.println(pc[2][1]);
		
		for(int i=0;i<pc.length;i++) {
			for(int j=0;j<pc[i].length;j++) {
				System.out.print(pc[i][j]+" ");
			}
			System.out.println();
		}
	}
}
