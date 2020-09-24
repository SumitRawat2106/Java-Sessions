package ExceptonHandling;

public class FinallyConcept {

	public static void main(String[] args) {
		System.out.println("A");
		
		try{
			int i = 9/0 ;
			//connect to DB 
			//get the data from DB -- exception is coming 
			
		}
		catch(Exception e) {
			System.out.println("Some exception is coming ");
		}
		
		finally {
			System.out.println("Disconnect DB");
			System.out.println("Hey");
		}

		
		//Finally keyword will always be executed whether exception is coming or not 
	}

}
