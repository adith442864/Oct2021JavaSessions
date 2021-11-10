package JavaSessions;

public class A {

	public static void main(String[] args) {
		
		System.out.println("A-MAIN");
		
		B.main(args);
		
		// StackOverflowError

	}

}
