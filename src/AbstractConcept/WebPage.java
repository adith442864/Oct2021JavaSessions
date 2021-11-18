package AbstractConcept;

public abstract class WebPage {
	
	// abstract class without any abstract method: is allowed
	// this is called 0% abstraction
	
	public void testing() {
		
		System.out.println("WebPage -- Testing");
	}
	
	public void automationTesting() {
		System.out.println("WebPage -- automationTesting");
	}
	
	public void performanceTesting() {
		System.out.println("WebPage -- performanceTesting");
	}
	
	

}
