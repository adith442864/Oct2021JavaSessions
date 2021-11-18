package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		
		// Exception is coming or not, always finally block is executed...
		
		System.out.println("A");
		
		try {
			int i=9/0;
		} 
		
		catch(Exception e) {
			System.out.println("Exception is here...");
		}
		
		finally {
			System.out.println("Bye......");
		}
		
		// make connection with db:
			// db is down -- exception
			// un/pwd is wrong -- exception
			// connectivity issue -- exception
		
		//2. connection is done...
		// get the data using sql query -- exception...
		// use the data
		
		
		// close the connection -- finally block
		
		System.out.println(getMarks("Naveen"));
		
	}
	
	
	public static int getMarks(String name) {
		
		if(name.equals("sonam")) {
			return 90;
			
		}
		else if(name.equals("Tom")) {
			try {
				int i = 9 / 0;
				return 45;
			}
			catch(Exception e) {
				return 50;
			}
			
			finally {
				System.out.println("inside finally block...");
				return 10;
			}
		}
		else if(name.equals("sujan")) {
			return 95;
		}
		
		return -1;
	
	}

}
