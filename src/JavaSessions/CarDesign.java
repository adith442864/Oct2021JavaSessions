package JavaSessions;

public class CarDesign {
	
	String name;
	String color;
	int price;
	
	static int wheels=4;

	public static void steering() {
		System.out.println("CAR-Steering");
		engine();
	}
	
	public static void engine() {
		System.out.println("CAR-engine");
	}
	
	public void getCarInfo() {
		System.out.println("get Car Info");
	}

}
