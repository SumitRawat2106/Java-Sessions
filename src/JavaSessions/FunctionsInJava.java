package JavaSessions;

import java.util.ArrayList;

public class FunctionsInJava {

	// Class methods - Class properties
	public static void main(String[] args) {
		
		FunctionsInJava fij = new FunctionsInJava();
		        fij.test();
		        int d = fij.add();
		        System.out.println(d);
		        String name [] = fij.getweekdayName();
		        System.out.println(name [0] + "  " +name [1] );
		        int answer = fij.division(60 , 2);
		        System.out.println(answer);
		        String a1 = fij.getCapitalName("India");
		        System.out.println(a1);
		        System.out.println( fij.getCapitalName("USA"));
		        
		        ArrayList<String> ar1 = fij.getStudentList("September");
		        		 System.out.println(ar1.size());
		        		 for (String n1 : ar1) {
		        			 System.out.println(n1);
		        		 }
		        		 
		        		 String str1[] = fij.getStudentList1("September");
		        		 System.out.println(str1.length);
		        		 for (String n2 : str1) {
		        			 System.out.println(n2);
		        		 }
		        		
		        		 
		        		 
	}

	
	 //1. no input & no return 
	// void - can not return anything
	public void test() {
		System.out.println("test method");
	}
	
	//2. no input & some return
	
	public int add() {
		System.out.println("add method");
		int a  = 10 ;
		int b  = 20 ;
		int c  = a +b ;
		return c ;
	}
	
	
	public String[] getweekdayName() {
		
		String day[] = new String[2] ;
		day[0] = "Monday";
		day[1] = "Tuesday";
		return day;
		
	}
	
	
	
	//3. some input & some return
			
			public int division(int i1 , int i2) {
				System.out.println("division method");
				int d = i1 / i2 ;
				return d ;
					
			}
			
			public String getCapitalName(String Countryname) {
			
				
				if (Countryname.equals("India")) {
					
				return "New Delhi" ;
				}
				else if (Countryname.equals("Japan")) {
				
					return "Tokyo" ;
				}
				else if (Countryname.equals("USA")) {
					return "Washington DC" ;	
				}	
				
			else {
						return "Countryname not found" ;	
				}
					
			}
			
			public ArrayList<String> getStudentList(String batchName) {
				ArrayList<String> studentList = new ArrayList<String>();
				if (batchName.equals("September")) {
					studentList.add("Suresh");
					studentList.add("Mukesh");
					studentList.add("Rakesh");
						
					
				}
				
				else if (batchName.equals("October")) {
					studentList.add("Tannu");
					studentList.add("Mannu");
					
				}
				return studentList;	
				
			}
			
			
			
			public String[] getStudentList1(String batchName) {
				String studentList1[] = new String[3];
				if (batchName.equals("September")) {
					studentList1[0] = "Suresh";
					studentList1[1] = "Ruresh";
					
				}
				
				else if (batchName.equals("October")) {
					studentList1[0] = "Suresh";
					studentList1[1] = "Ruresh";
					
				}
				return studentList1;
				
				
			}
		
			
			}


