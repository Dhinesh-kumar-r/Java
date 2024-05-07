package Practice;

class Dad{
	void dadMethod() {
		String face = "oval shape";
		System.out.println(face);
	}
}

class Son extends Dad{
	void sonMethod() {
		String facecut="Dad face Shape";
		System.out.println(facecut);
	}
}

public class SingleInherit {
	public static void main(String args[]) {
		Son call = new Son();
		call.dadMethod();
		call.sonMethod();
	}
}
