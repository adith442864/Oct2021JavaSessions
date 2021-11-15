package Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		
		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.emergencyServices();
		fh.ENTServices();
		fh.gyncServices();
		
		fh.pathologyServices();
		fh.medicalInsurance();
		
		System.out.println(USMedical.min_fee);
		fh.totalDoctors(100);
		
		fh.billing();
		
		fh.medicalTraining();
		fh.covidTest();
		
		fh.medicalResearch();
		
		
//		USMedical us = new USMedical(); Cannot create the object of interface
		
		//child class object can be referred by parent class interface ref variable:
		//Top Casting:
		USMedical us = new FortisHospital(); 
		us.orthoServices();
		us.cardioServices();
		us.physioServices();
		us.emergencyServices();
		USMedical.hospitalAdmin();
		
		//down casting: NOT Allowed
		

	}

}
