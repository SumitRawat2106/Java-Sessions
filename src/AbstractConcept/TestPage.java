package AbstractConcept;

public class TestPage {

	public static void main(String[] args) {
		
		Page.signup();
	    LoginPage lp =  new LoginPage();
	    lp.header();
	    lp.title();
	    HomePage hp = lp.login("Sumit", "1234");
	    hp.header();
	    hp.title();
	    hp.logout();
	  
	    
	    Page p = new LoginPage();
	    p.header();
	    p.title();
	    p.logout();
	   

}
}