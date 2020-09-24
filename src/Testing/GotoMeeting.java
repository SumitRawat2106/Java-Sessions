
package Testing;
import Test.Meeting;
public class GotoMeeting extends Meeting {

	public GotoMeeting(int id, String password) {
		super(id, password);
		
	}

	public static void main(String[] args) {
		Meeting m =  new Meeting(40 , "hsdghf123");
		System.out.println(m.id);
        m.start();
        
        
        GotoMeeting gm = new GotoMeeting(40 , "hsdghf123");
        System.out.println(gm.isRecorded);
	}

}
