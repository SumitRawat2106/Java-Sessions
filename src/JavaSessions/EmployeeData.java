package JavaSessions;

public class EmployeeData {
	
	public String name; 
	public int EmpID ; 
	public int age ;
	public String dept ;
	private int salary ;
	
	
	public EmployeeData(String name, int empID, int age, String dept, int salary) {
		super();
		this.name = name;
		EmpID = empID;
		this.age = age;
		this.dept = dept;
		this.salary = salary;
	}

	public void getEmployeeName() {
		System.out.println("Get employee name ");
		
		
	}
	
	private void getEmployeebonus() {
	
		System.out.println("Get employee bonus ");
	}
	
	public int getsalary(){
		return salary;
		
	}
	
	public void setsalary(int salary) {
		this.salary = salary;
		
	}

	public static void main(String[] args) {
		
		EmployeeData ed = new EmployeeData("Sumit" , 1001 , 26 , "IT" , 50000);
		System.out.println(ed.name);
		System.out.println(ed.salary);
		ed.getEmployeeName();
		ed.getEmployeebonus();
		
		

	}

}
