package JavaSessions;

public class EmployeeTest {

	public static void main(String[] args) {
		EmployeeData ed1 = new EmployeeData("Ankit" , 1002 , 27 , "ADMIN" , 20000);
		System.out.println(ed1.name);
        ed1.setsalary(15000);
        System.out.println(ed1.getsalary());
	}

}
