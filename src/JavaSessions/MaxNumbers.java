package JavaSessions;

public class MaxNumbers {

	public static void main(String[] args) {
		
		
	                      int x =  800 ;
	                      int y =  800 ;
	                      int z =  800 ;
	                      
	                   /**   if (x>y) {
	                            if (x>z) {
	                            	System.out.println("Max number is x");
	                            }
	                            else {
	                            	System.out.println("Max number is z");
	                            }
	                      }
	                      
	                      else {
	                    	  if (y>z) {
	                    		  System.out.println(("Max number is y"));
	                    	  }
	                    	  else {
	                    		  if (x == y & y == z) {
	                    			  System.out.println("All numbers are same");
	                    		  }
	                    		  else {
	                    			  System.out.println(("Max number is z"));
		                    	  }
	                    		  }
	                   
	                    	  }
	                    	  **/
	                      
	                      if (x>y && x>z)
	                      {
	                    	  System.out.println("Max number is x");
	                    	 
	                      }
	                      else if (y>z) {
	                    	  System.out.println(("Max number is y"));
	                      }
	                      else {
	                    	  if (x == y & y == z) {
                    			  System.out.println("All numbers are same");
                    		  }
                    		  else {
                    			  System.out.println(("Max number is z"));
	                    	  }
	                      }
	                  
	               
	                      }
	}


