package rbiPackage.sbi;

import rbiPackage.RBIMethods;

public class SBIMethods implements RBIMethods {

	public void checkWithdrawalAmount(int withdrawalAmount) {
		if(withdrawalAmount>50000) {
			System.out.println("PAN card needed");
		} else {
			System.out.println("PAN card not needed");
		}
	}

	public double calculateInterest(double principalAmount,double years,double rateOfInterest) {
		double simpleInterest = (principalAmount*years*rateOfInterest)/100;
		return simpleInterest;
	}
}
