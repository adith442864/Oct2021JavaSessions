package InheritanceConcept;

// final method used to prevent overriding
// final class used to prevent overriding
public class Car extends Vehicle {
	
	int engine = 10;
	
	public void start() {
		System.out.println("Car -- start");
	}
	
	public void stop() {
		System.out.println("Car -- stop");
	}

	
	public void refuel() {
		System.out.println("Car -- refuel");
	}
	
	
	public static void sunRoof() {
		System.out.println("Car -- sunRoof");
	}


}
