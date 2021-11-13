package InheritanceConcept;

public class TestCar {

	public static void main(String[] args) {
		
		
		BMW b = new BMW();
		b.start(); //overridden
		b.stop(); //inherited
		b.refuel(); //inherited
		b.autoParking(); //child
		BMW.sunRoof();
		System.out.println(b.engine);
		b.engine();
		
		//method overloading:
		b.musicSystem();
		b.musicSystem("hollywood");
		b.musicSystem("london", 94.4);
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		Car.sunRoof();
		System.out.println(c.engine);
		c.engine();
		
		//c.autoParking();
		
		// Top casting:
		Car c1 = new BMW(); //child class object can be referred by parent class ref variable
		c1.start(); //Overridden
		c1.stop(); // inherited
		c1.refuel(); //inherited
		
		//c1.autoParking()  -> reference type security check
		
		//down casting: is not allowed at run time.
		
//		BMW b1 = (BMW) new Car();  //java.lang.ClassCastException will be thrown at runtime.
		
		
		


	}

}
