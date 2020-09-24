package Test;

public class Meeting {
	    public int id ;
		private String password;
		int meetingcount = 20; 
		protected boolean isRecorded = true ;
		
		

	public Meeting(int id, String password) {
			super();
			this.id = id;
			this.password = password;
		}
	
	public void start () {
		System.out.println("Meeting start");
		
	}
   private void chat () {
	   System.out.println("Meeting chat");
	  
	}



	public static void main(String[] args) {
		 Meeting m = new  Meeting(20, "SUMTI123");
		
		 System.out.println(m.id);
		 System.out.println(m.password);
		 m.chat();
		 m.start();
		 System.out.println(m.meetingcount);
		 System.out.println(m.isRecorded);
		 
		 
	
		
		
		

	}

}
