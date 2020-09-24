package InheritenceConcept;

public class BMW extends Car {
	
	@Override
	public void start() {
		System.out.println("BMW --- Starts");
	}

	public void autoAirSuspension() {
		System.out.println("BMW --- Suspension");
	}
	
	
	
}
