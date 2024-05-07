package Oops;


class Trichy{
	int amount=1000;
	
	void tour() {
		System.out.println("Kallanai,Rockfort");
	}
}

class Chennai extends Trichy{
	
	int cost = 2000;
	
	void tourist() {
		System.out.println("Marina,Temple");
	}
}


class Madurai extends Chennai{
	int exp = 3000;
	
	void touring() {
		System.out.println("Temples");
	}
}





public class MultiLevelInheritance {
	public static void main(String args[]) {
		
		
		Madurai mdu = new Madurai();
		
		mdu.tour();
		mdu.tourist();
		mdu.touring();
		
		System.out.println(mdu.amount);
		System.out.println(mdu.cost);
		System.out.println(mdu.exp);
		
		System.out.println();
		
		Chennai che= new Chennai();
		
		che.tour();
		che.tourist();
		
		System.out.println(mdu.amount);
		System.out.println(mdu.cost);
		
		System.out.println();
		
		Trichy ty =  new Trichy();
		
		ty.tour();
		System.out.println(ty.amount);
		
		
		
		
	}
}
