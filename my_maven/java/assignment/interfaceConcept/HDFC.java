package assignment.interfaceConcept;

import java.util.Scanner;

public class HDFC implements RBI {
	
	public void recurringDeposit(float amount, float duration) {
		double interest = (amount*duration*INTEREST_RATE)/100;
		amount+=interest;
		System.out.println("Amount obtained after " + duration + " years: " + amount);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter deposit amount and duration: ");
		float amount = sc.nextFloat();
		float duration = sc.nextFloat();
		HDFC obj = new HDFC();
		obj.recurringDeposit(amount,duration);
		sc.close();
	}
}
