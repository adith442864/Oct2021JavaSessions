package JavaSessions;

public class FinallyConcept {

	public static void main(String[] args) {
		
		
		int p=10;
		try {
			int div=p/0;
		}
		catch(Exception e) {
			System.out.println("some exception is occured...");
		}
		
		
		finally{
			System.out.println("in finally block.....");
		}
		
		System.out.println("Bye!!!!");
		
		System.out.println(getMarks("tom")); //return 80

	}
	
	
	public static int getMarks(String name) {
		
		if(name.equals("tom")) {
			try {
				int i=9/0;
			}catch(Exception e) {
				return 98;
			}
			finally {
				return 80;
			}
			
		}else if(name.equals("peter")) {
			return 90;
		}else {
			System.out.println("name not found...");
			return -1;
		}
		
		
	}

}
