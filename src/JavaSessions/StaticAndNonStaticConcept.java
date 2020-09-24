package JavaSessions;

public class StaticAndNonStaticConcept {
	
	          String name ;
	          static int age ;
	          
	          
	          // Java memory : Heap memory and Stack memory 
	          // Static variable and methods are stored inside common memory allocation (CMA) inside stack memory 
	          // Non Static variable and methods are stored inside object in heap memory 

	public static void main(String[] args) {
		
		//1. How to call static stuff 
		//a.) Use them directly
		  age = 25 ;
		  System.out.println(age);
		  getName ();
		
	    //b.) Call by class name
		  StaticAndNonStaticConcept.age = 30 ;
		  System.out.println(age);
		  StaticAndNonStaticConcept.getName ();
		  
		//2. How to call non static stuff : create the object
		  
		  StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		  obj.name = "SUMIT";
		  System.out.println(obj.name);
		  obj.search();
		  
		  obj.age = 40;
		  obj.getName ();
		  
	}
	
	public void search () {
		System.out.println("search method");
	}

	public static void getName () {
		System.out.println("getName method");
	}

	
	
}
