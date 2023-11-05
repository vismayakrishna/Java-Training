package assignment.encapsulation;

import java.util.Scanner;

public class User {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pin number: ");
		int pin = sc.nextInt();
		Bank obj = new Bank();
		obj.setPinNumber(pin);
		obj.getPinNumber();
		obj.validatePin();
		sc.close();
	}
}
