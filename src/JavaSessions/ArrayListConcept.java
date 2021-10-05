package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		// ArrayList - Dynamic Array:
		// It is a class. 
		// its a index based collection == linear collection
		
		ArrayList ar = new ArrayList();
		
		System.out.println(ar.size()); //0
		
		ar.add(100); //0
		ar.add(200); //1
		
		System.out.println(ar.size()); //2
		
		ar.add(300); //2
		ar.add(400); //3
		
		System.out.println(ar.size()); //4
		
		ar.add(500); //4
		ar.add(600); //5
		ar.add(700); //6
		
		System.out.println(ar.size()); //7
		
		// how to ptiint all the values from arrayList:
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		
		// for each loop:
		for(Object o:ar) {
			System.out.println(o);
		}
		

	}

}
