package JavaSessions;

public class ArrayConcept {

	public static void main(String[] args) {
		
		           //1. int Array
		
		          int i [] = new int[4];
		          i[0]  = 10 ;
		          i[1] =  20 ;
		          i[2] =  30 ;
		          i[3] =  40 ;
		          System.out.println(i[0]);
		          System.out.println(i[3]);
		          System.out.println(i[1] + i[2]);
		          //System.out.println(i[4]);  // java.lang.ArrayIndexOutOfBoundsException
		          System.out.println(i.length);
		          
		          
		         //Print all values from an array  : for loop
		          
		          for (int k = 0 ; k<i.length ; k++) {
		        	  System.out.println(i[k]);
		          }
		          
		          //2. String Array
		          String names [] = new String [3];
		           names[0] = "SUMIT";
		           names[1] = "RAWAT";
		           names[2] = "ASHU";
		           
		           for (int z = 0 ; z<names.length ; z++){
		        	   
		        	   System.out.println(names[z]);
		           }
		           
		           
		           
		          // Limitation of array
		           //1. Size of array is fixed. : static array : to solve this problem we use dynamic array (Array List)
		           //2. Can only store similar types of values : to solve this problem we use static object array
		           
		           
		           
		           //3. Object Array (Object is a default class in java that is a (parent)superclass of all classes present in java)
		           
		           Object emp[] = new Object[5];
		           emp[0] = "SUMIT";
		           emp[1] = 28 ; 
		           emp[2] = 'M' ; 
		           emp[3] = true; 
		           emp[4] = 7.33;
		           
		           for (int y = 0 ; y<emp.length ; y++) {
		        	   System.out.println(emp[y]);
		           }
		           
		           
		           
		          
		          
		          
		          
	}


}
