package JavaSessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		
		int num = 30 ;
		
		switch (num) {
		case 10:
			System.out.println(10);
			break;
			
		case 20:
			System.out.println(10);
			break;

		default:
			System.out.println("*Number not found*");
			break;
		}
		
		//Selenium browser concept 
		
		String browser = "Chrome";
		
		switch (browser) {
		case "Chrome":
			System.out.println("Launch chrome browser");
			break;
			
		case "Firefox":
			System.out.println("Launch Firefox browser");
			break;

		default:
			System.out.println("*Please specify correct browser name ");
			break;
		}

		

	}

}
