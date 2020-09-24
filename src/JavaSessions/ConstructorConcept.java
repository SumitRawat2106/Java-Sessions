package JavaSessions;

public class ConstructorConcept {
	      
	      String name ;
	      int age ;
	      int userID ;
	      char gender ;
	      boolean isActive ;
	      static int wheels;
	      
	      //Constructor : Default and parameterized
	      public ConstructorConcept() {  //default or 0 parameterized constructor
	    	  System.out.println("default or 0 parameterized constructor is called ...");
	      }
	      
	      public ConstructorConcept(int a) {  //1 parameterized constructor
	    	  System.out.println("1 parameterized constructor is called ...");
	      }
	
	    //Constructor with class variables

		public ConstructorConcept(String name, int age, int userID, char gender, boolean isActive) {
				
				this.name = name;
				this.age = age;
				this.userID = userID;
				this.gender = gender;
				this.isActive = isActive;
			}

		
	public ConstructorConcept(String name, int wheels) {
			
			this.name = name;
			this.wheels = wheels;
		}

	public static void main(String[] args) {
		
		ConstructorConcept cc1 = new ConstructorConcept();
		ConstructorConcept cc2 = new ConstructorConcept(10);
		ConstructorConcept cc3 = new ConstructorConcept("Sumit", 26 , 1001 , 'M' , true);
        System.out.println(cc3.name + "  " +cc3.age+  "  "+cc3.gender+ "  "+ cc3.userID+"  " + cc3.isActive);
        ConstructorConcept cc4 = new ConstructorConcept("Sumit", 4 );
        
	}


}
