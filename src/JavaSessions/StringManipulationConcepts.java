package JavaSessions;

public class StringManipulationConcepts {

	public static void main(String[] args) {
		
		String str ="This is my java code and I am so happy";
		
		System.out.println(str.length()); //returns the length of the array
		
		int len = str.length();
		int li=0;
		System.out.println(li);
		
		int hi=len-1;
		System.out.println(hi);
		
		//charAt()
		System.out.println(str.charAt(2));
//		System.out.println(str.charAt(38)); //StringIndexOutOfBound Exception....
		
		//indexOf()
		System.out.println(str.indexOf('T'));
		System.out.println(str.indexOf('s')); //1st occurence of s
		System.out.println(str.indexOf("s", (str.indexOf('s')+1))); //2nd occurence of s
		
		System.out.println(str.indexOf('s', str.indexOf('s',str.indexOf('s')+1)+1)); //3rd occurence of s
		
		System.out.println(str.indexOf("java"));
		
		System.out.println(str.indexOf("Hello")); //-1
		
		
		String msg="Welcome admin";
		
		if(msg.indexOf("admin")>=0) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		
		//trim():
		String s="   hello world     ";
		System.out.println(s.trim().toString());
		
		String text = "   1234   ";
		System.out.println(text.trim());
		
		
		//replace:
		String dob = "01-01-1990";
		System.out.println(dob.replace("-", "/"));
		
		String s1="Hello Java and happy with Java";
		System.out.println(s1.replace("Java", "Python"));
		
		//contains()
		String s2="welcome admin";
		System.out.println(s2.contains("admin"));
		
		if(s2.contains("admin")) {
			System.out.println("correct messg...");
		}
		
		//concat():
		String s3="Hello";
		String s4="Selenium";
		System.out.println(s3.concat(s4).concat("Test Automation"));
		
		//compare()
		s3="this is my java code";
		s4="this is my My Java code";
		
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		
		//substring()
		String s5="this is my order id 12345";
		System.out.println(s5.substring(11)); //starts from 11th pos to the end of the string
		System.out.println(s5.substring(0, 11));
		System.out.println(s5.substring(s5.indexOf("id")+3, s5.length()));
		
		//split()
		String test="Java;Python;JavaScript;Ruby";
		String val[]=test.split(";");
		System.out.println(val[0]);
//		System.out.println(val[1]);
		
		//To print all the values
		for(String s6:val) {
			System.out.println(s6);
		}
		
		String userData="tom:peter:30:London:UK:99999:IBM";
		String userVal[]=userData.split(":");
		for(int i=0; i<userVal.length; i++) {
			System.out.println(userVal[i]);
		}
		
		//interview question
		String data = "xXtestingXxXxJavaxXselenium";
		String dataVal[]=data.split("xX");
		System.out.println("0th value is: "+dataVal[0]);
		System.out.println("1st value is: "+dataVal[1]);
		System.out.println("2nd value is: "+dataVal[2]);
		System.out.println("3rd value is: "+dataVal[3]);
		
		//Data conversion: String to data int/double conversion
		String x="100";
		System.out.println(x+20); //10020
		
		int i = Integer.parseInt(x); //static method
		System.out.println(i+20); //120
		
		//NumberFormat Exception:
		
		String str1="200A";
//		System.out.println(y+20); //200A20
//		int j = Integer.parseInt(y);
//		System.out.println(j+20); //java.lang.NumberFormatException
		
		
		String j =str1.replace("A", "");
		System.out.println(j);
		int k = Integer.parseInt(j);
		System.out.println(k+20);
		
		
		String d="12.33";
		System.out.println(d+100); //12.33100
		
		double d1 = Double.parseDouble(d);
		System.out.println(d1+100);

		//int to String conversion:
		int total=1000;
//		System.out.println(total+20);
		System.out.println(total+" "+20);
		String tt = String.valueOf(total); //convert integer to string:
		System.out.println(tt+100);
		
		
		
		
		
		

	}

}
