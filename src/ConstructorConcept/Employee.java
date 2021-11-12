package ConstructorConcept;

public class Employee {
	
	String name;
	int age;
	String dob;
	String city;
	boolean isPermanent;
	
	//constructor:
	//name of const...will remain same as class name:
	//it looks like function, but it is not a function.
	//constructor will never return a value: no return and no void keywords in const..
	//but a function may or may not return a value

	
	public Employee() {
		
	}
	
	public Employee(String name) {
		this.name=name;
	}
	
	
	public Employee(String name, int age) {
		this.name=name;
		this.age =age;
	}
	
	
	
	public Employee(String name, String city) {
		this.name = name;
		this.city = city;
	}
	
	
	public Employee(String name, int age, String dob, String city, boolean isPermanent) {
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.city = city;
		this.isPermanent = isPermanent;
	}

	public static void main(String args[]) {
		
		Employee e1 = new Employee("Tom");
		System.out.println(e1.name); //Tom
		
		Employee e2 = new Employee("Lisa", 25);
		System.out.println(e2.name + " " +e2.age +" "+e2.dob+" "+e2.city+" "+e2.isPermanent);
		
		Employee e3 = new Employee("Peter",30, "01-01-1990", "London", true);
		System.out.println(e3.name + " " +e3.age + " "+e3.dob+" "+e3.city+" "+e3.isPermanent);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
