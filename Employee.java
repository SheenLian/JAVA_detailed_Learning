package employee;

public class Employee {
	
	String name;
	String designation;
	int age;
	double salary;
	
	public Employee(String name, int empAge, String empDesig, double empSalary){
		this.name = name;
		this.age = empAge;
		this.designation = empDesig;
		this.salary = empSalary;
	}
	
	/*public void empAge(int empAge){
	age = empAge;
	}
	
	public void empDesignation(String empDesig){
		designation = empDesig;
	}
	public void empSalary(double empSalary){
		salary = empSalary;
	}*/
	
	public void printEmployee(){
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
		System.out.println("Designation: "+ designation);
		System.out.println("Salary: "+ salary);
	}
}
