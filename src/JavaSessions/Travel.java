package JavaSessions;

public class Travel {

	public static void main(String[] args) {
		Travel e = new Travel();
		e = null ;
		
				//requesting JVM to call GC	
				System.gc();
		System.out.println("Processing done....");

	}
	
	@Override
	public void finalize() {
		System.out.println("This is my finalize method ....");
	}

}


//finalize method will be called when specific class reference is null just before GC is called