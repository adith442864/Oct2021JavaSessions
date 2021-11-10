package JavaSessions;

public class LoginPage {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		
		lp.login("admin", "admin123");
		lp.search("iphone12", 80000);
		lp.doPayment(1212121, 101);

	}
	
	// Method Overloading: (Compile Time) OOP - Poly+Morphism
		// within the same class, when we have different methods 
		// with same name and
		// different input parameters
		// sequence of the params is also different
	
	public void login() {
		System.out.println("login to app");
	}
	
	
	public void login(int a) {
		
	}
	
	public void login(int a, int b) {
		
	}
	
	public void login(int a, String b) {
		
	}
	
	public void login(String a, int b) {
		
	}
	
	public void login(String un, String pwd) {
		System.out.println("login with : " +un +" and "+pwd);
		
	}
	
	public void login(String un, String pwd, int otp) {
		
	}
	
	public void login(String un, String pwd, int otp, String role) {
		
	}
	
	
	public void login(String un, String pwd, long phone) {
		
	}
	
	
	// E-commerce application: 
	public void search() {
		
	}
	
	public void search(String name) {
			
	}
	
	public void search(String name, int price) {
		System.out.println("product name :"+name);
		System.out.println("price is :" +price);
	}
	
	public void search(String name, int price, String color) {
		
	}
	
	public void search(String sellerName, int price, boolean available) {
			
	}
	
	//
	public void doPayment(String UPI) {
		
	}
	
	public void doPayment(String UPI, long phone) {
		
	}
	
	public void doPayment(long cc, int cvv) {
		System.out.println("make the payment with :" +cc +" and " + " cvv is :" +cvv);
		
	}
	
	public void doPayment(long phone, String pwd) {
		
	}
	
	
	
	
	
	
	
	
	

}
