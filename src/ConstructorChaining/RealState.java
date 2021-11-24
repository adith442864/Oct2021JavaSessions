package ConstructorChaining;

public class RealState extends Business {

	public RealState() {
		System.out.println("Realstate default const...");
	}
	
	
	public RealState(String type, int revenue, String branches) {
		super(type, revenue, branches);
		
	}

	public static void main(String[] args) {
		
		RealState rs = new RealState("realstate", 12345, "Bangalore");
//		System.out.println(rs.type);
		
		RealState rs1 = new RealState();
		
	}

}
