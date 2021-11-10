package JavaSessions;

public class Persons {

	public static void main(String[] args) {
		
		Persons p1 = new Persons();
		p1.getName();
		
	}
	
	
	public void getName() {
		
		System.out.println("Tom");
		
		getFirstName();
		
	}
	
	public void getFirstName() {
		
		System.out.println("Peter");
		
		getCity();
		
	}
	
	
	public void getCity() {
		
		System.out.println("Bangalore");
		getAddress();
		
	}
	
	
	public void getAddress() {
		
		System.out.println("Bangalore 560001");
		getPhone();
		
	}
	
	public void getPhone() {
		System.out.println("9999");
		
	}

}
