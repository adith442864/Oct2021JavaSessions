package JavaSessions;

public class DataConvert {

	public static void main(String[] args) {
		
		String x="100";
		System.out.println(x+20); //10020
		
		
		int s = Integer.parseInt(x);
		System.out.println(s+20); //120
		
		
		String y="12.33";
		System.out.println(y+100);
		
		double d = Double.parseDouble(y);
		System.out.println(d+100);
		
		String p = "100A";
		System.out.println(p+100);
		
//		int k = Integer.parseInt(p);
//		System.out.println(k+200); //java.lang.NumberFormatException
		
		// int to string:
		int m=100;
		System.out.println(m+20); //120
		String n = String.valueOf(m);
		System.out.println(n+200);
		
		
		
		
		
		
		
	}

}
