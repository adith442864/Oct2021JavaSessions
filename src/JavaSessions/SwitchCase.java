package JavaSessions;

// float and double values in switch case are not allowed:

public class SwitchCase {

	public static void main(String[] args) {
		
		
		String browser = "chrome";
		
		//switch-case:
		
		switch (browser) {
		case "chrome":
			System.out.println("launch chrome");
			break;
			
		case "firefox":
			System.out.println("launch firefox");
			break;
			
		case "safari":
			System.out.println("launch safari");
			break;
			
		case "IE":
			System.out.println("launch ie");
			break;

		default:
			System.out.println("please pass the correct browser " + browser);
			break;
		}
		
		//
		int marks=90;
		int discount=0;
	
		switch (marks) {
		case 100:
			System.out.println("A grade");
			discount=1000;
			break;
		
		case 90:
			System.out.println("B grade");
			discount=800;
			break;
			
		case 80:
			System.out.println("C grade");
			discount=500;
			break;	

		default:
			break;
		}
		
		System.out.println("your marks are : " + marks + " and discount is: " + discount);

	}

}
