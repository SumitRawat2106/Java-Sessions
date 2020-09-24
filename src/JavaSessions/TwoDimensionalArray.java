package JavaSessions;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		         
		            // 10 20 30 
		            // 40 50 60
		            // 70 80 90
		
		
		/**    int data [] [] = new int [4] [4] ;
		       data [0] [0] = 10                       **/
		// OR
		int data [] [] = {{10, 20 , 30} , {40, 50 , 60} , {70, 80 , 90}};
		   
		for (int i = 0 ; i<3 ; i++) {
			for (int j = 0 ; j<3 ; j++){
				System.out.print(data[i][j]+ " ");
			}
			System.out.println();
		}
		

	}

}
