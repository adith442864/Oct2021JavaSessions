package JavaSessions;

public class ReverseString {

	public static void main(String[] args) {
		
//		System.out.println(revereString(null));
		
		String str = "Selenium";
		
		//2nd Approach:
		
		StringBuffer sb= new StringBuffer(str);
		System.out.println(sb.reverse());
		
		//3rd Approach:
		StringBuilder sb1 = new StringBuilder(str);
		System.out.println(sb1.reverse());
		
		
	}
	
	public static String revereString(String value) {
		
		if(value == null) {
			System.out.println("you are passing a null value...");
			return null;
		}
		
		int len = value.length();
		
		if(len==1) {
			return value;
		}
		
		String rev="";
		
		for(int i=len-1; i>=0; i--) {
			rev=rev + value.charAt(i); //muineles
		}
		
		return rev;
	}
	

}
