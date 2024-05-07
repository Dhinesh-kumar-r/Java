package Practice;

class lap{
	private int laptop ;
	
	public void setprice(int laptop) {
		this.laptop = laptop;
	}
	
	public int getprice() {
		return laptop;
	}
	
	
}

public class Encap {
	public static void main(String args[]) {
		
		lap call = new lap();
	
		call.setprice(2520);
	
		System.out.println(call.getprice());
	}
}
