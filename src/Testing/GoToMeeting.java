package Testing;

import Test.Meeting;

public class GoToMeeting extends Meeting {
	

	public GoToMeeting(int id, String password) {
		super(id, password); //always used to call super class const....
		
	}
	
	
	public static void main(String[] args) {
		
		//using the class from different package, import
		Meeting m = new Meeting(103, "test12345");
		
		System.out.println(m.id);
//		System.out.println(m .password); private var can't be accessed...
		
		m.start();
		
//		m.chat();
		
//		System.out.println(m.studentCount); outside package, default var/method cané be accessible
		
//		System.out.println(m.isRecorded);
		
		GoToMeeting go = new GoToMeeting(201, "test123");
		
		System.out.println(go.id);
		System.out.println(go.isRecorded); //outside the package by subclass Object reference:
		
		
		
		
	}

}
