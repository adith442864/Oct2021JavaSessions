package InheritanceConcept;

public class BMW extends Car {
	
	// Method Overriding: (runtime polymorphism)
	// when we have parent class having same method with the same name and same no of parameters in child class
	
	@Override
	public void start() {
		System.out.println("BMW -- start");
	}
	
	
	
	public void autoParking() {
		System.out.println("BMW -- autoParking");
	}
	
	//static method cannot be overridden in Java:
//	@Override
	public static void sunRoof() {
		System.out.println("Car -- sunRoof");
	}
	
	// method overloading in child class is allowed: polymorphism (compile time)
	public void musicSystem() {
		System.out.println("BMW -- musicSystem");
	}
	
	public void musicSystem(String CD) {
		System.out.println("BMW -- musicSystem with" +CD);
	}
	
	public void musicSystem(String radio, double radioFrequency) {
		System.out.println("BMW -- musicSystem with" +radio +" frq -> "+radioFrequency);
	}
	
	

}
