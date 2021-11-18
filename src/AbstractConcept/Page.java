package AbstractConcept;

public abstract class Page {
	
	//cannot create the object of abstract class
	// page class const will be called when we create an object of child class
	// some abstract methods and some non abstract methods: partial abstraction
	
	public Page() {
		System.out.println("Page -- default constructor");
	}
	
	public abstract void title();
	public abstract void url();
	public abstract void loading();
	
	
	public void header() {
		System.out.println("page -- header");
	}
	
	public static final void logo() {
		System.out.println("page -- logo");
	}
	
	
	

}
