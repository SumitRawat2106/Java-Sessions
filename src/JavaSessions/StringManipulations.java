package JavaSessions;

public class StringManipulations {

	public static void main(String[] args) {
	     String str = "This is my Java code and i am so happy" ;
	     System.out.println(str.length());
	     System.out.println(str.charAt(1));
	//     System.out.println(str.charAt(38)); //StringIndexOutOfBoundsException error
	     System.out.println(str.indexOf("m")); 
	
	     System.out.println(str.indexOf("java"));  // -1
	     System.out.println(str.indexOf("java"));
	     System.out.println(str.indexOf("s"));  //1st occurence of s
	     System.out.println(str.indexOf("s" , 4));  //2nd occurence of s
	     
	     
	     String msg =  "Welcome Admin";
	     if (msg.indexOf("Admin")> 0) {
	    	 System.out.println("Pass");
	    	 
	     }
	     else {
	    	 System.out.println("Fail");
	     }
	     
	     //Compare Strings
	     String s1 = "Hello World";
	     String s2 = "Hello World";
	     
	     System.out.println(s1.equals(s2));
	     
	     String s3 = "Hello World";
	     String s4 = "hello world";
	     
	     System.out.println(s3.equalsIgnoreCase(s4));
	     
	     //trim
	     String p = "   Hello World   ";
	     System.out.println(p.trim());
	     
	     //replace
	     System.out.println(p.trim().replace(" " , ""));
	     
	     String DOB = "12-12-1994"; //12/12/1994
	     System.out.println(DOB.replace("-" , "/"));
	     
	     //UCASE and LCASE
	     String m  = "This is Selenium";
	     System.out.println(m.toLowerCase());
	     System.out.println(m.toUpperCase());
	     
	     //Substring
	     String n  = "This is Selenium";
	    System.out.println(n.substring(4));
	     System.out.println(n.substring(5 , 7));
	     
	     //Split
	     String n1  = "Tom;25;Male";
	     String str1 [] = n1.split(";");
	     System.out.println(str1[0]);
	     for (int i = 0 ; i<str1.length ; i++) {
	    	 System.out.println(str1[i]);
	     }
	     
	     String credentials = "Admin;testpassword";
	     String username = credentials.split(";")[0];
	     String password = credentials.split(";")[1];
	     
	     doLogin(username , password);
	     
	}
	
	public static void doLogin (String un,String pwd) 
    {
   	 System.out.println("Logged in with " + un + " " + pwd);
    }

}
