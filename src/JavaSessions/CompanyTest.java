package JavaSessions;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company c = new Company ();
		c.name = "IBM";
		c.totalEmp = 100 ;
		c.setBudget(200000);
		System.out.println(c.getBudget());
		c.setProjects("Dating");
		System.out.println(c.getProjects());

	}

}
