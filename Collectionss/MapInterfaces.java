package Collectionss;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterfaces {
	public static void main(String args[]) {
		Map<String,String> map = new HashMap<>();
		
		map.put("actor", "vijay");
		map.put("hero", "simbu");
		map.put("actress", "Thrisha");
		System.out.println(map.get("actor"));
		
		Set<String>keys = map.keySet();
		for(String key:keys) {
			System.out.println(map.get(key));
		}
	}
}
