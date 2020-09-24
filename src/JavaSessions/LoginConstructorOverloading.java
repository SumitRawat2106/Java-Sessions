package JavaSessions;

public class LoginConstructorOverloading {
	
	String username ;
	String password ;
	String facebookID;
	int OTP ;
	long mobilenumber ;
	
	

	public LoginConstructorOverloading(String username, String password, String facebookID, int oTP, long mobilenumber) {

		this.username = username;
		this.password = password;
		this.facebookID = facebookID;
		OTP = oTP;
		this.mobilenumber = mobilenumber;
	}

	public LoginConstructorOverloading(String username, String password) {
	
		this.username = username;
		this.password = password;
	}
	
	public void dologin() {
		System.out.println("LoggedIn Successfully using " + username + "  " + password);
	}

	public static void main(String[] args) {
		
		LoginConstructorOverloading lco = new LoginConstructorOverloading("Sumit" , "1234");
		
		lco.dologin();
		
		

	}

}
