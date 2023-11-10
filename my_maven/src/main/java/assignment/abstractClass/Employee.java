package assignment.abstractClass;

public abstract class Employee {

	String employeeName;
	int empId;
	String companyName;
	int salary;
	
	public Employee(String employeeName, int empId, String companyName) {
		this.employeeName = employeeName;
		this.empId = empId;
		this.companyName = companyName;
	}

	public abstract void calculateSalary(int paymentPerHour);
}
