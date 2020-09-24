package ExceptonHandling;

public class ThrowConcept {

	public static void main(String[] args)  {
	       try {
			throw new Exception("This is my Exception");
	       }
	       catch(Exception e) {
	    	   e.printStackTrace();
	    	   
	       }
	

	}

}
