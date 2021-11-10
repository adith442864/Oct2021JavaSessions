package JavaSessions;

public class TestDrive {

	public static void main(String[] args) {
		
		CarDesign c1 = new CarDesign();
		c1.name="BMW";
		c1.color="Blue";
		c1.price=70;
		
		c1.getCarInfo();
		
		CarDesign c2 = new CarDesign();
		c2.name="Audi";
		c2.color="White";
		c2.price=80;
		
		CarDesign c3 = new CarDesign();
		c3.name="Honda";
		c3.color="Red";
		c3.price=30;
		
		System.out.println(c1.name + " "+c1.color +" " +c1.price +" "+CarDesign.wheels);
		System.out.println(c2.name + " "+c2.color +" " +c2.price +" "+CarDesign.wheels);
		System.out.println(c3.name + " "+c3.color +" " +c3.price +" "+CarDesign.wheels);
		
		CarDesign.steering();

	}

}
