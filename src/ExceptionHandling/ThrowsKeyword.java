package ExceptionHandling;

public class ThrowsKeyword {
	
	public void m1() throws Exception {
		System.out.println("m1");
		m2();
	}
	
	public void m2() throws Exception {
		System.out.println("m2");
		m3();
	}

	public void m3() throws Exception {
		System.out.println("m3");
		m4();
		
	}

	public void m4() throws Exception{
		System.out.println("m4");
		try {
			booking();
		}
		catch(Exception e) {
			System.out.println("handled....");
		}
	}
	
	public void booking() {
		System.out.println("booking cab....");
		int i =9/0;
	}
	
	public static void main(String[] args) throws Exception {
		
		// Throws keyword is used to throw the exception from one method to another...
		// Throws Keyword will not handle the exception deliberately...
		
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m1();
		

	}

}
