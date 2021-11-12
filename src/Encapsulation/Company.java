package Encapsulation;

public class Company {
	
	public String name;
	public int empCount;
	private int sharePrice;
	
	
	public String getCEOName() {
		return "Tom";
	}
	
	
	private int totalSharePrice() {
		return 1000;
	}
	

	public static void main(String[] args) {
		
		Company obj = new Company();
		obj.name="IBM";
		obj.empCount=500;
		obj.sharePrice=100;
		
		obj.getCEOName();
		
		obj.totalSharePrice();
		

	}

}
