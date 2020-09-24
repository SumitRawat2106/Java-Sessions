package InheritenceConcept;

public class TestCar {

	public static void main(String[] args) {
		BMW b =  new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.autoAirSuspension();
		b.engine();
		
		
		Car c =  new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		//Top Casting
		Car c1 =  new BMW(); // child class object can be referred parent class reference 
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		
		Vehicle v1 =  new BMW();
		v1.engine();
		
		Vehicle v2 =  new Car();
		v2.engine();
		
		//Static methods cannot be override and if any method is declared as final it cannot be override
		// final class cannot be inherited 
		
		//Down Casting
	//	 BMW b1 = new Car();
		
		// BMW b1 =(BMW) new Car(); //ClassCastexception error at runtime 
		

	}

}
