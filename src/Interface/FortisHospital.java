package Interface;

public class FortisHospital extends MedicalAssociation implements USMedical, UKMedical, IndianMedical {
	
	// USA:
	
	@Override
	public void orthoServices() {
		System.out.println("Fortis Hospital -- orthoServices");
		
	}

	@Override
	public void physioServices() {
		System.out.println("Fortis Hospital -- physioServices");
		
	}
	
	@Override
	public void cardioServices() {
		System.out.println("Fortis Hospital -- cardioServices");
		
	}
	
	@Override
	public void totalDoctors(int count) {
		System.out.println("total doctors " +count);
	}

	//UK:
	
	@Override
	public void pediaServices() {
		System.out.println("Fortis Hospital -- pediaServices");
		
	}

	@Override
	public void ENTServices() {
		System.out.println("Fortis Hospital -- ENTServices");
		
	}
	
	@Override
	public void emergencyServices() {
		System.out.println("Fortis Hospital -- emergencyServices");
		
	}
	
	//India:
	
	@Override
	public void gyncServices() {
		System.out.println("Fortis Hospital -- gyncServices");
		
		
	}

	@Override
	public void neuroServices() {
		System.out.println("Fortis Hospital -- neuroServices");
		
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("Fortis Hospital -- oncologyServices");
		
		
	}
	
	//own methods:
	public void pathologyServices() {
		System.out.println("Fortis Hospital -- pathologyServices");
	}

	public void medicalInsurance() {
		System.out.println("Fortis Hospital -- medicalInsurance");
	}
	
	@Override
	public void billing() {
		System.out.println("FH -- Billing");
	}
	
	// WHO:
	@Override
	public void covidTest() {
		System.out.println("FH -- covid19 Test");
		
	}
	
	



}
