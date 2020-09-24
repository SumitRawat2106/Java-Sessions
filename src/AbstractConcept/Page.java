package AbstractConcept;

public abstract class Page {
	
	//Abstract methods and non abstract methods
    //Abstract methods
	public abstract void header();
	public abstract void title();
	
	
	// Non Abstract methods
	public void logout() {
		System.out.println("User Logged out");
	}
	
	//Abstract class object cannot be created
	//Abstract class constructor can be called but it will be called with child class object creation
	
	Page(){
		System.out.println("Page class constant");
	}
	
	public static void signup() {
		System.out.println("User sign up ");
	}

}
