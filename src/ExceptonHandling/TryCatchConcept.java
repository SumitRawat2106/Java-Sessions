package ExceptonHandling;

public class TryCatchConcept {
       String name = "Sumit" ;
	public static void main(String[] args) {
		TryCatchConcept tcc = new TryCatchConcept() ; 
		System.out.println("A");
		System.out.println("B");
		
		//JVM will throw an exception with the help of :
		//1. it will create the object of exception class
		//2. it will print the the exception info with the help of stack trace and exception handler 
				
		try {
			tcc = null ;
			System.out.println(tcc.name);
		int i = 9/0 ;
		}
		
		catch(ArithmeticException e){
			System.out.println("Some exception occured ....");
			// e.printStackTrace();
			System.out.println(e.getMessage() + " exception got occured");
			
		}
		catch(NullPointerException e1){
			System.out.println("Some exception occured ....");
			// e.printStackTrace();
			System.out.println(e1.getMessage() + " exception got occured");
			
		}
		
	// Exception is super class of all types of exception (ArithmeticException , NullPointerException etc)	
    //Throwable is super class of exception and error
		/**catch(Exception e){
		System.out.println("Some exception occured ....");
		// e.printStackTrace();
		System.out.println(e.getMessage() + " exception got occured");
		
	}**/
		
		/**catch(Throwable e){
		System.out.println("Some exception occured ....");
		// e.printStackTrace();
		System.out.println(e.getMessage() + " exception got occured");
		
	}**/
		
		System.out.println("C");
		System.out.println("D");
		System.out.println("E");

	}

}
