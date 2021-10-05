package JavaSessions;

public class TimeComplexity {

	public static void main(String[] args) {
		
		// Notation : BIG 0
		
		int i=10; //0(1)
		System.out.println(i); //0(1)
		
		int p1=10+20;
		System.out.println(p1);
		
		// time complexity : 0(10) --> O(n)
		// i=1 (1 time executed, i<=10 -- 10 times, sop - 10 times, k++ - 10 times)
		// 1+10+10+10 = 1+n+n+n = 1+3n = 3n = n = O(n)
		
		for(int k=1; k<=10; k++) {
			System.out.println(k);
		}
		
		// time complexity for two for loops:
		//  (1+3n) (1+3n) = +1+3n+3n+9n2(square) = 1+6n+9n2 = 9n2+6n+1 = quad equation
		// 		9n2+6n = 3(n2+2n) = n2+n = n(n+1) = n2 = O(n2)
			for(int p=1; p<=10; p++) {
				for(int q=1; q<=10; q++) {
					System.out.println(p+q);
				}
				
				//System.out.println(p);
			}

	}

}
