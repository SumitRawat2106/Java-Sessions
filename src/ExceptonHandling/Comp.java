package ExceptonHandling;

public class Comp {

	public static void main(String[] args) {
		
		int  s = Comp.revenue();
		System.out.println(s);
	}

	public static int revenue () {
		try {
			int p = 100;
			int T = p +200;
			int total = T/0;
			return total ;
		
		}
		catch(Exception e) {
			System.out.println("Some exception occured");
		}
		finally {
			return 0 ;
		}

		
		
	}
	
	
}
