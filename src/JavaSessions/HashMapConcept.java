package JavaSessions;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {
		
		// HashMap: Key, Value
		
		HashMap<String, String> empMap = new HashMap<String, String>();
		
		empMap.put("A", "Tom");
		empMap.put("B", "Naveen");
		empMap.put("C", "Lisa");
		empMap.put("D", "Peter");
		
		System.out.println(empMap.get("B"));
		System.out.println(empMap.size()); //4
		
		//Default capacity : 16 segments
		

	}

}
