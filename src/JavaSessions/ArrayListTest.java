package JavaSessions;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Object> ar = new ArrayList<Object>();
		
		ar.add(100);
		ar.add("testing");
		ar.add(12.33);
		ar.add(true);
		ar.add('m');
		
		System.out.println(ar.get(1));
		
		// generics in ArrayList:
		// cannot store primitive data types:
		
		// 1. int arrayList:
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		
		marksList.add(100); //0
		marksList.add(200); //1
		marksList.add(300); //2
		
		System.out.println(marksList.get(0));
//		System.out.println(marksList.get(-1)); //java.lang.IndexOutOfBoundsException
//		System.out.println(marksList.get(3)); //java.lang.IndexOutOfBoundsException
		
		// 2. String ArrayList:
		
		ArrayList<String> namesList = new ArrayList<String>();
		namesList.add("Tom"); //0 
		namesList.add("Peter"); //1
		namesList.add("Naveen"); //2
		
		System.out.println(namesList.size());
	
//		namesList.remove(1); //removed "Peter"
		System.out.println(namesList.size()); //2
		System.out.println(namesList.get(1));
		
		for(int i=0; i<namesList.size(); i++) {
			System.out.println(namesList.get(i));
		}
		
		// for each loop:
		for(String s : namesList) {
			System.out.println(s);
			
			if(s.equals("Peter")) {
				System.out.println("Peter is found......");
				//break;
			}
			
		}
		
		
		
		
		
		
		
		
		

	}

}
