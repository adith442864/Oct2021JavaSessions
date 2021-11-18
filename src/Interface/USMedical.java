package Interface;

public interface USMedical extends WHO {
	
	int min_fee=10;
	
	//Interface cannot have method body:
	//only method prototype
	//only method declaration
	// cannot create the object of interface
	// all the variables in interface are declared with static and final by default.
	// static method cannot be overridden
	// interface cannot have a superclass
	
	// 100% abstraction
	
	//abstract methods:
	public void orthoServices();
	
	public void physioServices();
	
	public void cardioServices();
	
	public void emergencyServices();

//	public void services911();
	
	public void totalDoctors(int count); //parameterized method
	
	// after JDK 1.8:
	//1. we can have static methods in Interface with method body:
	
	public static void hospitalAdmin() {
		System.out.println("US - hospitalAdmin");
	}
	
	//2. we can have default method:
	
	default void billing() {
		System.out.println("US -- Billing");
	}
	
	

}
