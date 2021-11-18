package ExceptionHandling;

public class ThrowKeyword {
	
	//Throw keyword will be used to create a custom exception......

	public static void main(String[] args) {
		
		try {
			throw new Exception("Excel CEL Data is Blank Exception");
		}
		catch(Exception e) {
			System.out.println("some exception is occured...");
			e.printStackTrace();
		}
		
		
		
		
		
		

	}

}
