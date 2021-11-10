package JavaSessions;

import java.util.ArrayList;

public class Company {
	
	String name;
	int empCount;
	

	public static void main(String[] args) {
		
		Company co = new Company();
		System.out.println(co.getCEOName());
		
		int shares = co.getTotalCount();
		System.out.println(shares);
		
		String cofounders[] = co.getCoFounders();
		System.out.println(cofounders.length);
		
		for(String e :cofounders) {
			System.out.println(e);
		}
		
		
		ArrayList<String> custList = co.getCustomerList();
		System.out.println("Total number of customers :" +custList.size());
		
		for(String s: custList) {
			System.out.println(s);
		}

	}
	
	
	public String getCEOName() {
		return "Tom";
	}
	
	
	
	public int getTotalCount() {
		System.out.println("get total count of the shares");
		int totalShare=2000;
		return totalShare;
	}
	
	
	public String[] getCoFounders() {
		System.out.println("get cofounders");
		
		String founder[] = new String[3];
		founder[0]="Tom";
		founder[1]="Peter";
		founder[2]="Steve";
		
		return founder;
		
	}
	
	public ArrayList<String> getCustomerList() {
		System.out.println("get customer list");
		
		ArrayList<String> custList = new ArrayList<String>();
		custList.add("Nestle");
		custList.add("Pepsi");
		custList.add("Deo");
		
		return custList;
		
	}
	
	
	
	
	
	
	
	
	
	

}
