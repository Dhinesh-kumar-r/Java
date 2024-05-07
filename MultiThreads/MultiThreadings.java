package MultiThreads;

class Food extends Thread{
	public void run() {
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Processing...");
	}
}

 class Time extends Thread {
	 public void run() {
		 for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		 }
	 }
 }
public class MultiThreadings {
	public static void main(String args[]){
		Food fd = new Food();
		fd.start();
		
		Time ti = new Time();
		ti.start();
	}

}
