package inheritance.assignment;

import java.util.Scanner;

public class SalaryDivision {
	
	int basicPay;
	int deduction;
	int bonus;
	
	public void getSalaryDivision() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter basic pay: ");
		basicPay = sc.nextInt();
		System.out.print("Enter deduction: ");
		deduction = sc.nextInt();
		System.out.print("Enter bonus: ");
		bonus = sc.nextInt();
		sc.close();
	}
}
