package assignment.abstractClass;

import java.util.Scanner;

public class Contractor extends Employee {

	public Contractor(String employeeName, int empId, String companyName) {
		super(employeeName, empId, companyName);
	}
	
	public void calculateSalary(int paymentPerHour) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter working hours for contractor: ");
		int workingHours = sc.nextInt();
		salary = paymentPerHour*workingHours;
		sc.close();
	}
	
	public void print() {
		System.out.println("Contractor Details");
		System.out.println("------------------");
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Employee Id: " + empId);
		System.out.println("Company Name: " + companyName);
		System.out.println("Employee Salary: " + salary);
	}
}


