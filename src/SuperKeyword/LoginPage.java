package SuperKeyword;

public class LoginPage extends Page {
	
	public LoginPage() {
		super(40);
		System.out.println("Login Page Cosnst....");
	}

	int loadTime = 20;
	
	void loading() {
		System.out.println("login page load time is:" +loadTime);
		System.out.println("page load time is:" +super.loadTime);
		
		pageTitle();
		super.pageTitle();
	}
	
	public void pageTitle() {
		System.out.println("Login Page -- title");
	}

}
