package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		
		ArrayList<String> ar= new ArrayList<String>();
		
		ar.add("A");
		ar.add("b");
		ar.add("c");
		
		System.out.println(ar);
		System.out.println(ar.size());
		
		ar.clear();
		
		System.out.println(ar);
		System.out.println(ar.size());
		
		ArrayList<String> ar1= new ArrayList<String>();
		
		ar1.add("A");
		ar1.add("B");
		ar1.add("C");
		ar1.add("D");
		System.out.println(ar1);
		
		ArrayList<String> ar2 = (ArrayList<String>)ar1.clone();
		System.out.println(ar2);
		
		//contains:
		System.out.println(ar1.contains("D"));
		System.out.println(ar1.contains("N"));
		
		//indexOf:
		System.out.println(ar1.indexOf("B")>0);
		
		//default capacity:
		ArrayList<String> ar3= new ArrayList<String>(2);
		ar3.add("Test");
		ar3.add("Selenium");
		System.out.println(ar3);
		
		//new capacity:
		ar3.ensureCapacity(10);
		
		
		// for each:JDK 1.8 with lamda:
		ar1.forEach(e -> System.out.print(e+ " "));
		System.out.println();
		ar1.forEach(e -> System.out.print(e.toLowerCase()+" "));
		
		System.out.println();
		
		ArrayList<String> EmpList= new ArrayList<String>();
		EmpList.add("Tom");
		EmpList.add("Peter");
		EmpList.add("Naveen");
		EmpList.add("Daisy");
		System.out.println(EmpList);
		
		Collections.sort(EmpList);
		System.out.println(EmpList);
		
		Collections.sort(EmpList, Collections.reverseOrder());
		System.out.println(EmpList);
		
		

	}

}
