package InterfaceConcept;

public interface USMedical {
	
	int min_fee = 100;
	
	public void orthopedicServices();
	public void dentalServices();
	public void nueroServices();
	public void ambulanceServices();
	
	//no method body -- 100 abstraction
	//only method declaration/method prototype
	//no static methods in Interface 
	// but interface variables are static and final in nature by default 
	//cannot crate object of interface 
	//After JDK 1.8:
	//1. can have method body : with default method
	default void Services_911() {
		System.out.println("US ---- 911 services");
	}
	
	//2. can have static methods in interface
	public static void billing() {
		System.out.println("US---Billing ");
	}

}
