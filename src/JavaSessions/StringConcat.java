package JavaSessions;

public class StringConcat {

	public static void main(String[] args) {
		
		
		String s1 = "Hello World";
		System.out.println(s1);
		
		String s2 = "1000";
		System.out.println(s2);
		
		int a=100;
		int b=200;
		
		String x="Hello";
		String y="Selenium";
		
		double d1=12.33;
		double d2=23.33;
		
		
		System.out.println(a+b);
		System.out.println(x+y); //String concat
		
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		
		System.out.println(d1+d2);
		System.out.println(a+b+d1+d2);
		System.out.println(a+b+d1+d2+x+y);
		System.out.println(x+y+a+b+d1+d2);
		
		
		System.out.println("the value of a is: " +a);
		System.out.println("the value of a is: " +b);
		System.out.println("the sum is: " +(a+b));
		
		char c='a'; //97
		char c1='b'; //98
		
		System.out.println(c+c1); //97+98
		System.out.println(c1-c);
		System.out.println(c1*c);
		System.out.println(c); //a
		
		//interview question: ASCII Range:
		// a-z: 97-122
		// A-Z: 65-90
		// 0-9: 48-57
		
		System.out.println(x+c);
		
		System.out.println(4/2); //2
		System.out.println(5/2); //2
		System.out.println(5.0/2); //2.5
		System.out.println(5/2.0); //2.5
		System.out.println(5.0/2.0); //2.5
		
//		System.out.println(9/0); //ArithmeticException.
		System.out.println(0/10); //0
		
		System.out.println(4 % 2); //remainder operator
		System.out.println(5 % 2); 
		System.out.println(17 % 3);
		
		
		
		
	}

}
