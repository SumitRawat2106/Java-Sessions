package JavaSessions;

public class IfElseConditional {

	public static void main(String[] args) {
		
		int a = 30 ;
		int b = 20 ;
		
		if (b>a) {
			System.out.println("b is greater than a ");
		}
		else {
			System.out.println("a is greater than b ");
		}

		int num = 5;
				if (num<20) {
					System.out.println("PASS");
				}
				
				if (num<50) {
					System.out.println("BYE");
					if(num<10) {
						System.out.println("FAIL");	
						if (num<2) {
							System.out.println("OHH");	
						}
						else {
							System.out.println("YUP");
						}
					}
				}
				
				int y = 100 ;
				int z = 100 ;
				if (z==y) {
					System.out.println("PASS");
				}
				else {
					System.out.println("FAIL");
				}
				
				
				//< , <= , >= , !=
				
				if (z!=y) {
					System.out.println("PASS");
				}
				else {
					System.out.println("FAIL");
				}
				
				String s1 = "HELLO";
				String s2 = "HELLO";
				if (s1.equals(s2)) {
					System.out.println("STRING COMPARISON PASS");
				}
				
				
				//IF ElseIF Ladder
			int number  = 20;
			if (number == 10) {
				System.out.println("number is 10 ");
			}
			else if (number == 15) {
				System.out.println("number is 15 ");
			}
			else if (number == 20) {
				System.out.println("number is 20 ");
			}
			
			String browser = "Firefox";
			if (browser.equals("Chrome")) {
				System.out.println("Launch Chrome browser");
			}
			else if (browser.equals("Firefox")) {
				System.out.println("Launch Firefox browser");
			}
			
			
			
			
			String browser1 = "Test";
			if (browser1.equals("Chrome")) {
				System.out.println("Launch Chrome browser");
			}
			else if (browser1.equals("Firefox")) {
				System.out.println("Launch Firefox browser");
			}
			else {
				System.out.println("Wrong browser please pass the correct browser name");
			}
					
			
			
			// dead code 
			if (true) {
				System.out.println("PASSSSSS");
			}
			else {
				System.out.println("FALSEE");
			}
			
			
			Boolean t = false ;
			if (!t) {
				System.out.println("testeeee");
			}
			else {
				System.out.println("heyyyyy");
			}
		
		
	}

}
