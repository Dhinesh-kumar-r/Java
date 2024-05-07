package Java;

public class LocalVariable {
	
	
	void localVariable() {
		String name="dhinesh";
		System.out.println(name);
	}
	public static void main(String args[]) {
		LocalVariable call = new LocalVariable();
		call.localVariable();
	}
}
