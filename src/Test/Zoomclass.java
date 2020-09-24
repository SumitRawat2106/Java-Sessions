package Test;

public class Zoomclass {

	public static void main(String[] args) {
		Meeting m  = new Meeting(30 , "RAWAT200");
		System.out.println(m.id);
		m.start();
		System.out.println(m.meetingcount);
	

	}

}
