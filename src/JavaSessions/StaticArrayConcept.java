package JavaSessions;

public class StaticArrayConcept {

	public static void main(String[] args) {
		
		// Limitations of array:
		// 1. size is fixed: static array: to overcome this, we can use ArrayList(Collections)
		// 2. similar data types u can store: to overcome this, we can use Object Array:
				// we can use ArrayList<Object> = collection. 
		
		// int array:
		// store only similar data types:
		
		int i[] = new int[4];
		//i[-1]=5; //ArrayIndexOutOfBoundsException
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println("LI = :" +0);
		
		int len = i.length;
//		System.out.println("length = :" +len);
//		System.out.println("HI = :" + (len-1));
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		
		//System.out.println(i[4]); //ArrayIndexOutOfBoundsException
		//System.out.println(i[-1]); //ArrayIndexOutOfBoundsException
		
		// how to print all values from Array:
		
		for(int k=0; k<i.length; k++) {
			System.out.println(i[k]);
		}
		
		
		// for each loop:
		for(Integer e : i) {
			System.out.println(e);
		}
		
		// double array:
		
		double d[] = new double[3];
		d[0] = 12.33;
		d[1]= 13.33;
		d[2]=23.44;
		
		// char array:
		char c[] = new char[3];
		c[0]='a';
		c[1]='b';
		c[2]='c';
		
		// string array:
		
		String lang[] = new String[3];
		lang[0]="Java";
		lang[1]="Python";
		lang[2]="Ruby";
		
		for(String s :lang) {
			System.out.println(s);
		}
		
		for(int p=0; p<lang.length; p++) {
			System.out.println(lang[p]);
		}
		
		// Object Array:
		Object obj[] = new Object[5];
		obj[0] ="Tom";
		obj[1] =25;
		obj[2] ='m';
		obj[3] =34.44;
		obj[4] =true;
		
		for(Object o:obj) {
			System.out.println(o);
		}
		
	}

}
