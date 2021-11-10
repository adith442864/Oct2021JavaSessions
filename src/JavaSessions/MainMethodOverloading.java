package JavaSessions;

public class MainMethodOverloading {

	public static void main(String[] args) {
		
		System.out.println(args.length); //0
//		System.out.println(args[0]); //Arrayindexoutofbound exception
		
		System.out.println("Hello World");
		main(10);
		main(10, 20);
		main(10, "Hello");

	}
	
	public static void main(int a) {
		System.out.println(a);
		
	}
	
	public static void main(int a, int b) {
		
		System.out.println(a+b);
	}
	
	public static void main(int a, String c) {
		System.out.println(a+c);
		
	}

}
