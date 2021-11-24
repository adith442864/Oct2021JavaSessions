package JavaSessions;

public class FinalizeConcept {

	public static void main(String[] args) {
		
		//Finalize: special mechanism associated with Garbage Collector:
		
		FinalizeConcept obj = new FinalizeConcept();
		obj=null;
		
//		Employee e1= new Employee();
//		e1=null;
		
		System.gc();
		
		System.out.println("processing done....");

	}
	
	@Override
	public void finalize() {
		System.out.println("inside the finalize method...");
	}
	
	

}
