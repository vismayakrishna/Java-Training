package inheritance.assignment;

import java.util.Scanner;

public class TotalSalary extends SalaryAllowance {
	
	double totalSalary;
	
	public TotalSalary(int basicPay, int deduction, int bonus) {
		super(basicPay, deduction, bonus);
	}
	
	public void calculateTotalSalary() {
		totalSalary = basicPay+hra-pf-deduction+bonus;
	}
	
	public void getSalarySlip() {
		System.out.println("----SALARY SLIP----");
		System.out.println("Basic Pay: " + basicPay);
		System.out.println("Deduction: " + deduction);
		System.out.println("HRA: " + hra);
		System.out.println("PF: " + pf);
		System.out.println("Bonus: " + bonus);
		System.out.println("Total Salary: " + totalSalary);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter basic pay: ");
		int basicPay = sc.nextInt();
		System.out.print("Enter deduction: ");
		int deduction = sc.nextInt();
		System.out.print("Enter bonus: ");
		int bonus = sc.nextInt();
		sc.close();
		TotalSalary totalSalary = new TotalSalary(basicPay,deduction,bonus);
		totalSalary.calculateHra();
		totalSalary.calculatePf();
		totalSalary.calculateTotalSalary();
		totalSalary.getSalarySlip();
	}

}


