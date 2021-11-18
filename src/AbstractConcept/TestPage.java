package AbstractConcept;

public class TestPage {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		
		lp.header();
		lp.title();
		lp.loading();
		lp.url();
		
		lp.doLogin("admin", "admin");
		lp.doLogin("admin", "admin", "abc.com");
		
		Page.logo();
		
		//Top casting: child class object can be referred by parent class variable
		
		Page p = new LoginPage();
		
		p.title();
		p.header();
		p.url();
		p.loading();
		p.logo();
		
		//down casting: not allowed(object can not be created)

	}

}
