package JavaSessions;

public class Employee {
	
	// class vars:
	String name;
	int age;
	double salary;
	boolean isActive;
	

	public static void main(String[] args) {
		
		//Object creation:
		// new keyword:
		//default value of String: null, integer = 0, double=0.0, boolean=false
		
		Employee e1 = new Employee(); // new Employee is object which is referred by e1
		
		e1.name="Tom";
		e1.age=24;
		e1.salary=34.44;
		e1.isActive=false;
		
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.isActive);
		
		Employee e2 = new Employee();
		e2.name="Lisa";
		e2.age=24;
		e2.salary=34.12;
		e2.isActive=true;
		
		System.out.println(e2.name +" "+e2.age+" "+e2.salary +" "+e2.isActive);
		
		// important: objects created in Heap and references created in Stack Memory:
		
		new Employee(); //GC will be kicked off.
		
		Employee e4 = new Employee();
		e4=null;
//		e4.name="testing"; //NullPointerException
		
//		System.gc(); //destroys objects having null/no reference:
		
		
		
		
		
		
		
		
		
		
		
	}

}
