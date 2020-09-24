package JavaSessions;

public class StringConcatenation {

	public static void main(String[] args) {
		String x = "Hello";
		String y = "Selenium";
		
		int a  = 100;
		int b  = 200;
		
		System.out.println(a+b);
		System.out.println(x+y);
		
		System.out.println(a+x);
		System.out.println(a+b+x+y);
		
		System.out.println(x+y+a+b);
		
		System.out.println(x+y+(a+b));
		
		System.out.println("The value of a is "+ a);
		System.out.println("The value of b is "+ b);
		System.out.println("Sum of a and b is "+ (a + b));
		
		char c1  ='a'; //97
	    char c2  ='b'; //98
	    System.out.println(c1+c2);
	    //0-9 : 48-57
	    //a-z : 97-122
	    //A-Z : 65-90
	    
	    

}
}