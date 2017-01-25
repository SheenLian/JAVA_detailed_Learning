package employee;

public class EmployeeTest {
	
	public static void main(String args[]){
	Employee emp1 = new Employee("Sheen Lian", 27, "Software Engineer", 4000);
	Employee emp2 = new Employee("Lily Shi", 26, "Civil Engineer", 4000);
	/*
	emp1.empAge(27);
	emp1.empDesignation("Software Engineer");
	emp1.empSalary(4000);
	
	
	emp2.empAge(26);
	emp2.empDesignation("Civil Engineer");
	emp2.empSalary(4000);
	*/
	emp1.printEmployee();
	emp2.printEmployee();
	System.out.println("My name is ".concat("Zara"));
	}
}
