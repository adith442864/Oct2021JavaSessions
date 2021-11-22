package JavaSessions;

public class FinalKeyword {

	public static void main(String[] args) {
		
		final int a=10;
		
		//not able to modify: to provide the constant values
//		a=20;
//		System.out.println(a++);
//		System.out.println(++a);
		
		final int days=7;
		
		int salary = days*10;
		
		System.out.println(salary);
		
		// final keyword is used to prevent overriding methods and inheritance
		

	}

}
