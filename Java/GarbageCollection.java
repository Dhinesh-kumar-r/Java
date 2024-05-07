package Java;

public class GarbageCollection {

	

	public static void objectcreation() {
		
		GarbageCollection x =new GarbageCollection();
	}
	
	protected void finalize() {
		System.out.println("Finalize Method Executed");
	}
	
	
	
	public static void main(String[] args) {
	
		//Garbage collection is process of to remove un used memory in a program --garbage collector
		
		//1.object value set to null
		//2.point the object to another  object which is already null
		//3 create a object in a method
		//4.island of isolation -make over object in a class to null
		
		GarbageCollection x =new GarbageCollection();
		GarbageCollection x1 =new GarbageCollection();
					x = null;
		x1 = x;
		GarbageCollection.objectcreation();
		System.gc();
		
	}

}
