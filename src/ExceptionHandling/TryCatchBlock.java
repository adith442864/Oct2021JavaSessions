package ExceptionHandling;

public class TryCatchBlock {
	
	String name;

	public static void main(String[] args) {
		
		// Throwable -> Exception -> Arithmetic => NullPointer -> IndexoutOfBound -> ClassCastException
		//			  -> Error -> Compiler -> Overflow Error --> Fatal Error -> Environment/Config 
		
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		
		try {
			TryCatchBlock obj = new TryCatchBlock();
			
			//obj = null;
			obj.name="test";
			System.out.println(obj.name);	
					
			int i=9/0;
			System.out.println("Bye!!!"); // this line will not be printed as soon as an exception is thrown
		} 
		
		catch(NullPointerException e) { //NPE
			System.out.println("NULL pointer exception is coming...");
			//e.printStackTrace();
		}
		
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception is coming...");
			//e.printStackTrace();
		}
		
		

		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		
		
		

	}

}
