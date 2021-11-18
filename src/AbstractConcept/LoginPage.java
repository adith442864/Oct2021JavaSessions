package AbstractConcept;

public class LoginPage extends Page{
	
//	public abstract void testing(); //not allowed
	
	public LoginPage() {
		System.out.println("LP -- Constructor");
	}

	@Override
	public void title() {
		System.out.println("LoginPage -- title");
		
	}

	@Override
	public void url() {
		System.out.println("LoginPage -- url -> http://www.xyz.com");
		
	}

	@Override
	public void loading() {
		System.out.println("LoginPage -- loading");
		
	}
	
	// own method:
	
	public void doLogin(String un, String pwd) {
		System.out.println("login with :"+un+ "and" +pwd);
	}
	
	public void doLogin(String un, String emailId,String pwd) {
		System.out.println("login with :"+un+ "" +pwd+ " "+emailId);
	}
	
	//override the header method - non static
	
	

}
