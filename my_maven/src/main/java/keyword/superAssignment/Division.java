package keyword.superAssignment;

import java.util.Scanner;

public class Division extends Addition {
	
	int num1,num2;
	
	public void checkDivisibility() {
		
		int sum = super.addTwoNumbers(num1,num2);
		if(sum%10==0) {
			System.out.println(sum + " is divisible by 10");
		} else {
			System.out.println(sum + " is not divisible by 10");
		}
	}

	public static void main(String[] args) {
		Division division = new Division();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		division.num1 = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		division.num2 = sc.nextInt();
		sc.close();
		division.checkDivisibility();

	}

}
