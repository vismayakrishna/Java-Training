package assignment.polymorphism;

import java.util.Scanner;

public class OnSeason extends OffSeason {

	public void discount(float price) {
		double discount = 0.4 * price;
		System.out.println("Discount during On-season: " + discount);
	}

	public void chooseOption() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter price: ");
		float price = sc.nextFloat();
		System.out.println("Choose Season: \n**********\n1. On-Season \n2. Off-Season");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			discount(price);
			break;
		case 2:
			super.discount(price);
			break;
		default:
			System.out.println("Not a valid option");
			break;
		}
		sc.close();
	}

	public static void main(String[] args) {
		OnSeason obj = new OnSeason();
		obj.chooseOption();
	}
}
