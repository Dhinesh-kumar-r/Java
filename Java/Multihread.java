package Java;

public class Multihread extends Thread {
	
	public void run() {
		for(int i =0 ; i<5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void display() throws InterruptedException{
		for(int i =100;i<110;i++) {
			System.out.println(i);
			Thread.sleep(2000);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
		Multihread obj = new Multihread();
		
		Thread  t = new Thread(obj);
		System.out.println(t.getState());
		obj.start();
		display();
		
	}

}
