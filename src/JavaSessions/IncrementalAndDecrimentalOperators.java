package JavaSessions;

public class IncrementalAndDecrimentalOperators {

	public static void main(String[] args) {
		
		// 1. post increment:
		int a=1;
		int b=a++; //given a original value to b then increment a by 1
		System.out.println(a); //2
		System.out.println(b); //1
		
		int c = -99;
		int d=c++; //-99 given to d
		System.out.println(c); // -99+1 = -98
		System.out.println(d); // -99
		
		int g = -1000; 
		int h= g++;
		System.out.println(g); //-1000+1 = -999
		System.out.println(h);  //-1000
		
		//2. pre increment:
		int m=1;
		int n =++m;
		System.out.println(m); //2
		System.out.println(n); //2
		
		int u = -99;
		int o=++u; //-99+1=-98
		
		System.out.println(u); //-98
		System.out.println(o); //-98
		
		//3. post decrement:
		int x=2;
		int y=x--;
		System.out.println(x); //1
		System.out.println(y); //2
		
		//4. pre decrement:
		
		int q= 3;
		int r = --q;
		
		System.out.println(q); //2
		System.out.println(r);  //2
		
		// interviewQ:
		int total=100;
		System.out.println(total++); //100
		System.out.println(total); //100
		
		int bal=999;
		System.out.println(++bal); //1000
		System.out.println(bal); //1000
		
		double d1 = 99.99;
		System.out.println(++d1); //100.99
		
		char c1 ='a'; //97 ASCII Value of a 
		System.out.println(++c1); //b
		
//		boolean b1=true;
//		System.out.println(++b1); //throw error
		
	}

}
