package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		
		// 1. while loop:
		
		int i=1;//start - initialization
		
		while(i<=10) { //conditional 
			System.out.println(i);
			//i=i+1; // increment/decrement 
			i++;
			//++i;
		}
	
	// welcome to my hotel :infinite
	
//		while(true) {
//			System.out.println("welcome!! to my hotel");
//		}
		
		//infinite code:
//		boolean flag = true;
//		while(flag) {
//			System.out.println("Hii");
//		}
		
		//dead code or unreachable code
//		
//		while(false) {
//			System.out.println("Hello");
//		}
//				
		
		System.out.println("----------------------");
		
		
		// 2. for loop:
		// 1 to 10:
		
		for(int j=1; j<=10; j++) {
			System.out.println(j); //1 2 3 4 5 6 7....10
		}

		//interviewQ
		// Infinite loop:
//		for(; ;) {
//			System.out.println("Hello");
//		}
		
		System.out.println("-----------");
		
		// a to z:
		for(char c='a'; c<='z'; c++) {
			System.out.println(c);
		}
		
		//double/float:
		for(double d=1.1 ; d<=10; d++) {
			System.out.println(d);
		}
		
		System.out.println("----------do while-----");
		// 3. do-while:
		int p=1;
		do {
			System.out.println(p);
			p++; //break
		}
		
		while(p<=10); 
		
		// 4. for-each loop:
		int marks[] = new int[5];
		marks[0]=100;
		marks[1]=200;
		marks[2]=300;
		marks[3]=400;
		marks[4]=500;
		
		for(int a=0; a<marks.length; a++) {
			System.out.println(marks[a]);
		}
		
		//
		for(Integer e: marks) {
			System.out.println(e);
		}
				
		//Write a Program to Print only Even numbers (1 to 10)
		//o/p: 2,4,6,8,10
		
		for(int even=2; even<=10; even+=2) {
			System.out.println(even);
			
		}
		
		System.out.println("------Modulo----------");
		// using modulus %
		for(int eve=2; eve<=10; eve++) {
			if(eve % 2 == 0) {
				System.out.println(eve);
			}
		}
		
		
		// WAP to print only odd numbers (1 to 10)
		//1 3 5 7 9
		for(int odd=1; odd<10; odd=odd+2) {
			System.out.println(odd);
			//odd+=2;
		}
		
		// for loop with if condition:
		// print from 1 to 100:
		// when I find a number which is divisible by 5, then print "Hi"
		
		for(int div=1; div<=100; div++) {
			System.out.println(div);
			if(div % 5 == 0) {
				System.out.println("Hii!!!!!!");
				break;
			}
		}
		
		
		
		
		
		
				
		//5. streams: JDK 8 for ArrayList:
		//6. forEach Loop Method - JDK 8
		
		
		
		
		
		
		

	}	

}