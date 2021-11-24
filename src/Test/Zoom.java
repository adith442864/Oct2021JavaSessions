package Test;

public class Zoom {

	public static void main(String[] args) {
		
		Meeting m = new Meeting(102, "test1234");
		
		System.out.println(m.id);
//		System.out.println(m.password); can't access private variables 
		
		m.start(); 
//		m.chat(); private method
		
		System.out.println(m.studentCount); //default var
		
		System.out.println(m.isRecorded);

	}

}
