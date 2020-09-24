package JavaSessions;

public class LoginPageMethodOverloading {
	             
	           // Method overloading : Same method name but it has different parameters , different types of parameters 
	                                    //  and different sequence of parameters
	
	

	public static void main(String[] args) {
		
		LoginPageMethodOverloading lp = new LoginPageMethodOverloading ();
		lp.Login();
		lp.Login(1234);
		lp.Login("sumitrawat103@gmail.com",1234);
		
	
	}
	
	
	public void Login() {
		
	}
	
    public void Login(String username) {
		
	}
    
    public void Login(String username ,String Password ) {
		
  	}
    
    public void Login(String FacebookID , int MobileNmuber) {
		
	}
    
    public void Login(int MobileNmuber , String FacebookID) {
		
   	}
    
    public void Login(int OTP) {
		
   	}
    
    

}
