package JavaSessions;

public class IfElseConditional {

	public static void main(String[] args) {
		
		// Conditional operators : < > == != <= >= 
		
		int a=10;
		int b=10;
		
		System.out.println(a==b);
		
		if(a==b) {
			System.out.println("Hi");
		}
		else {
			System.out.println("Bye");
		}
		
		//dead code..Unreachable code. InterviewQ
		if(true) { 
			System.out.println("Testing");
		}
		else {
			System.out.println("Development");
		}
		
		//String Comparison:
		
		String s1 = "Selenium";
		String s2 = "selenium";
		
		if(s1.equals(s2)) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("both are not equal");
		}
		
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("both are equal");
		}
		
		// nested if:
		int marks=60;
		if(marks>=60) {
			System.out.println("A grade");
			
			if(marks<=80) {
				System.out.println("B grade");
				
				if(marks<=60){
					System.out.println("C grade");
				}
			}
			
		}
		else {
			System.out.println("FAIL");
		}
		
		// multiple ifs example:
		
		String browser="chrome";
		
		if(browser.equals("chrome")) {
			System.out.println("launch chrome");
			//break; //not allowed.
		}
		if(browser.equals("firefox")) {
			System.out.println("launch firefox");
		}
		
		if(browser.equals("safari")) {
			System.out.println("launch safari");
		}
		
		
	// if-elseif
		
		if(browser.equals("chrome")) {
			System.out.println("launch chrome");
		}
		else if(browser.equals("firefox")) {
			System.out.println("launch firefox");
		}
		
		else if(browser.equals("safari")) {
			System.out.println("launch safari");
		}
		
		else {
			System.out.println("plase pass the correct browser");
		}
		
		// InterviewQ
		// Write a Program to find out max number where three different numbers are given:
		
		int x=100;
		int y=200;
		int z=300;
		
		if(x>y && x>z) { //false && false = false
			System.out.println("x is the greatest");
		}
		
		else if(y>z) { //false
			System.out.println("y is the greatest");
		}
		
		else { //true
			System.out.println("z is the greatest");
		}
		
		double d1=12.33;
		double d2=12.33;
		
		if(d1 == d2) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
		
		char c1= 'a';
		char c2='a';
		
		if(c1 == c2) {
			System.out.println("equal");
		}
		
		if(c1==97) { //take ascii value and compare it. 
			System.out.println("Hey");
		}
		
				


	}

}
