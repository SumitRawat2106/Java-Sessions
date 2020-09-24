package JavaSessions;

public class MethodChaining {

	public static void main(String[] args) {
		m1();
		//n1();
		 MethodChaining mc = new  MethodChaining ();
		 mc.n1();

	}
	
	public static void m1() {
		m2();
		
	}
	
   public static void m2() {
	  m3();
		
	}
   
   public static void m3() {
	   System.out.println("Static methods chaning");
		
	}
   
   public void n1() {
		n2();
		
	}
	
  public void n2() {
	 n3();
		
	}
  
  public void n3() {
	   System.out.println("Non Static methods chaning");
		
	}

}
