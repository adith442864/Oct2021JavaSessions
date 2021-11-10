package JavaSessions;

public class LoginClass {
	
	String username;
	String password;
	String title;
	String url;
	

	public static void main(String[] args) {
		
		LoginClass googleLogin = new LoginClass();
		googleLogin.username ="admin";
		googleLogin.password="admin123";
		googleLogin.title="Login";
		googleLogin.url="http://google.com";
		
		System.out.println(googleLogin.username +" " +googleLogin.password +" "+googleLogin.title+" "+googleLogin.url);
		
		LoginClass amazonLogin = new LoginClass();
		amazonLogin.username ="adith";
		amazonLogin.password="adith123";
//		amazonLogin.title="Login";
		amazonLogin.url="http://amazon.com";
		
		System.out.println(amazonLogin.username+" "+amazonLogin.password+" "+amazonLogin.url);
		
		LoginClass myLogin = new LoginClass();
		myLogin.url="http://myapp.com";
		
		System.out.println(myLogin.username);
		System.out.println(myLogin.password);
		System.out.println(myLogin.title);
		System.out.println(myLogin.url);
		
		new LoginClass().username="admin@gmail.com"; //not a good practice.
//		new LoginClass().password="admin@123";
		

	}

}
