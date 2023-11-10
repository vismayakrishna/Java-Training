package assignment.abstractClass;

public class FullTimeEmployee extends Employee {

	final int WORKING_HOURS = 8;
	
	public FullTimeEmployee(String employeeName, int empId, String companyName) {
		super(employeeName, empId, companyName);
	}

	public void calculateSalary(int paymentPerHour) {
		salary = paymentPerHour*WORKING_HOURS;
	}
	
	public void print() {
		System.out.println("Full-time employee Details");
		System.out.println("--------------------------");
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Employee Id: " + empId);
		System.out.println("Company Name: " + companyName);
		System.out.println("Employee Salary: " + salary);
	}
}


