package JavaSessions;

public class Employee {

		    // data members  : class members :
		    // 1. class variables :declare at class level
		    // 2. class Methods
		
		String name ;
		int age  ;
		char gender ;
		boolean isPermanent ;
		
		
		public static void main(String[] args) {
			
			
			Employee e1 =  new Employee ();
			  e1.name = "Sumit";
			  e1.age  = 26;
			  e1.gender = 'M';
			  e1.isPermanent = true ;
			  
			  System.out.println(e1.name + " " + e1.age + " " + e1.gender + " " + e1.isPermanent );
			  
			  Employee e2 =  new Employee ();
			  e2.name = "RAWAT";
			  e2.age  = 25;
			  e2.gender = 'F';
			  e2.isPermanent = false ;
			  
			  System.out.println(e2.name + " " + e2.age + " " + e2.gender + " " + e2.isPermanent );
			  
			  new Employee().name = "SURESH";
			  Employee e3 =  new Employee ();
			  e3 =  null ; // null reference object
			  System.gc(); // Garbage collector is called and it ask permission from JVM to delete the null reference object and object which do not have reference
			  
			  
			  
			  
			
	}

}
