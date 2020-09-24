package JavaSessions;

public class Training {
	
	String name ;
	String course ;
	String time ;
	
	public Training() {
		
	}
	
	
	public Training(String name, String course, String time) {
		
		this.name = name;
		this.course = course;
		this.time = time;
	}
	


	@Override
	public String toString() {   //String representation of any object 
		return "Training [name=" + name + ", course=" + course + ", time=" + time + "]";
	}


	public static void main(String[] args) {
		Training t =  new Training("Sumit" ,"Java" , "7 AM" );
		System.out.println(t.toString());


	}

}
