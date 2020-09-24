package JavaSessions;

public class Search {

	public static void main(String[] args) {
		 Search s  = new  Search();
		 s.search("Apple Macbook");
		int Finalprice =  s.search("Apple Macbook" , 65000);
		System.out.println(Finalprice);
		

	}
	
	
   public void search(String name) {
	   System.out.println("Search is done by " + name);
   }
   
   public int search(String name , int price) {
	   System.out.println("Search is done by " + name + " and " + price);
	   
	   int totalprice = price - 1000;
	   return totalprice ;
   }

}
