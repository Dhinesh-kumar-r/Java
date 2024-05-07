package Array;

public class ForEachArray {
	public static void main(String args[]) {
		
		String country[]= {"India","USA","Russia","DUbai"};
		
		for(String c : country) {
			System.out.println(c);
		}
		
		System.out.println();
		
		String state []= new String[5];
		
		state[0] ="tamilnadu";
		state[1]="kerala";
		state[2]="andra";
		state[3]="karnataka";
		state[4]="pondy";
		
		for(String s : state) {
			System.out.print(s+" ");
		}
		
		
		
	}
}
