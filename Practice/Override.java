package Practice;
class Original{
	void org() {
		System.out.println("a");
	}
}
public class Override extends Original{
	void org() {
		super.org();
		System.out.println("A");
	}
	public static void main(String args[]) {
		Override call = new Override();
		call.org();
	}
}
