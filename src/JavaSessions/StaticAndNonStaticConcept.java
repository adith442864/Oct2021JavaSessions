package JavaSessions;

public class StaticAndNonStaticConcept {
	
	String name;
	static int age;
	
	public void getName() {
		System.out.println("get name");
	}
	
	
	public static void getInfo() {
		System.out.println("get info");
	}

	public static void main(String[] args) {
		
//		static int i=10; //illegal modifier
		
		// how to access non static vars and methods:
		// we have to create object of the class:
		
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.name="Tom";
		System.out.println(obj.name);
		
		obj.getName();
		
		// how to call static vars and methods:
		// 1. call them directly : No need to use the object 
		
		age=25;
		
		System.out.println(age);
		
		//2. you can call them using class Name:
		StaticAndNonStaticConcept.age=50;
		System.out.println(age);
		
		getInfo();
		StaticAndNonStaticConcept.getInfo();
		
		//3. Can I use object to call static vars and methods:
		obj.age=40;
		obj.getInfo();
		
		

	}

}
