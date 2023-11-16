package userPackage;

import java.io.IOException;
import java.util.Scanner;

import rbiPackage.federal.FederalMethods;
import rbiPackage.sbi.SBIMethods;

public class User {
	
	public void chooseBank() throws IOException {
		Scanner sc = new Scanner(System.in);
		ReadBankData obj1 = new ReadBankData();
		System.out.print("Enter withdrawal Amount: ");
		int withdrawalAmount = sc.nextInt();
		System.out.println("Choose your bank: 1.SBI  2.Federal");
		int option = sc.nextInt();
		switch(option) {
			case 1:
				SBIMethods sbi = new SBIMethods();
				sbi.checkWithdrawalAmount(withdrawalAmount);
				obj1.readSBIData();
				break;
			case 2:
				FederalMethods federal = new FederalMethods();
				federal.checkWithdrawalAmount(withdrawalAmount);
				obj1.readFederalData();
				break;
			default:
				System.out.println("Choose a valid option");
				break;
		}
		sc.close();
	}
	
	public static void main(String[] args) throws IOException {
		User obj2 = new User();
		obj2.chooseBank();
	}
}
