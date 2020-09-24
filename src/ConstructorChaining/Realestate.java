package ConstructorChaining;

public class Realestate extends Business {
	
	

	public Realestate(String type, int revenue, String branches) {
		super(type, revenue, branches);
		
	}
	
	public Realestate () {
		super();
		System.out.println("Realestate contructor");
	}

	public static void main(String[] args) {
		Realestate re = new Realestate("Realestate", 40000 , "New delhi");
		System.out.println(re.revenue);
		
		Realestate re1 = new Realestate();
		
		

	}

}
