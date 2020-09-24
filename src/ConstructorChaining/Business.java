package ConstructorChaining;

public class Business {
	
	String type ;
	int revenue ;
	String branches ; 
	
	public Business() {
		System.out.println("Default business constructor");
	}

	
	public Business(String type, int revenue, String branches) {
		super();
		this.type = type;
		this.revenue = revenue;
		this.branches = branches;
	}



	public static void main(String[] args) {
		Business b = new Business();
	
	}

}
