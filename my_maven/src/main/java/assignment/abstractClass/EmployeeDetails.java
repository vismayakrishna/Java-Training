package assignment.abstractClass;

import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		Contractor obj1 = new Contractor("Raj", 132, "abc");
		FullTimeEmployee obj2 = new FullTimeEmployee("Kumar", 213, "xyz");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter payment per hour for contractor: ");
		int payment1 = sc.nextInt();
		System.out.println("Enter payment per hour for full-time employee: ");
		int payment2 = sc.nextInt();
		obj1.calculateSalary(payment1);
		obj2.calculateSalary(payment2);
		obj1.print();
		System.out.println();
		obj2.print();
		sc.close();
	}
}
