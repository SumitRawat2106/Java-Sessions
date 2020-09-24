package AbstractConcept;

public class LoginPage extends Page {
	
	public LoginPage() {
		System.out.println("LP const");
	}

	@Override
	public void header() {
		System.out.println("Login Page header ");
		
	}

	@Override
	public void title() {
		System.out.println("Login Page title ");
		
	}
	
	
	public HomePage login(String username , String password) {
		System.out.println("Login Page ");
		System.out.println("Login with " + username + " and " + password);
		return new HomePage ();
	}
	

}
