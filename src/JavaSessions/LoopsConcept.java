package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		
		       //Two types of Loops :
		       // 1. while/for/do while 
		       // 2. infinite loop / storage of memory loop : pitfalls loop in java
		
		
		     
		    // 1. while loop
		
		//Printing value 1 to 10
		     
		        int i  = 1 ; //initialization
		        while(i<=10) {   //conditional
		        	System.out.println(i);
		        	i++;         //incremental or decremental
		        }
		
		          //Printing value 10 to 1
		        int j  = 10 ;
		        while(j>=1) {
		        	System.out.println(j);
		        	j--;
		        }
		
		        
		     // 2. for loop
		        
		        for (int k= 1; k<=10; k++)
		        {
		        	System.out.println(k);
		        }

		        
		        
		      //  for (; ; )  // infinite loop
		      //  {
		    //    	System.out.println("Test");
		   //     }

		        
		        // 3. do-while loop
		        
		        int z = 1;
		         do {
		        	 System.out.println(z);
		        	 z++;
		         }
		        while(z<=10);
		        
	}

}
