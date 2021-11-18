package WebDriverArch;

public class GoogleApplicationTesting {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
//		ChromeDriver driver = new ChromeDriver();
		
//		FirefoxDriver driver = new FirefoxDriver();
		
		// Top casting: cross browser testing
		String browser ="firefox";
		
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}else if(browser.equals("safari")) {
			driver=new SafariDriver();
		} else {
			System.out.println("pass the correct browser....");
		}
		
		driver.get("http://wwww.google.com");
		driver.getTitle();
		driver.getPageUrl();
		driver.findElement("username");
		driver.quit();

	}

}
