package ConstructorConcept;

import java.util.ArrayList;

public class TestDrive {

	public static void main(String[] args) {
		
		CarDesign c1 = new CarDesign("Alto", "Red");
		System.out.println(c1.name+" "+c1.color+" "+c1.price);
		
		
		CarDesign c2 = new CarDesign("BMW", "Blue",70, 'Y');
		System.out.println(c2.name+" "+c2.color+" "+c2.price+" "+c2.isAvailable);
		
		
		ArrayList<String> audiQ5Features = new ArrayList<String>();
		audiQ5Features.add("Automatic Parking");
		audiQ5Features.add("Turbo Q Engine");
		audiQ5Features.add("Sun Roof");
		audiQ5Features.add("Rear Camera");
		audiQ5Features.add("Navigation Assist");
		
		CarDesign c3 = new CarDesign("Audi", "White",80, 14.4, false, 'Y',audiQ5Features);
		System.out.println(c3.name+" "+c3.color+" "+c3.price+" "+c3.mileage+" "+c3.isAvailable+" "+c3.featuresList );
		
		String f1 = c3.featuresList.get(0);
		System.out.println(f1);
		

	}

}
