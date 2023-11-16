package rbiPackage.federal;

import rbiPackage.RBIMethods;

public class FederalMethods implements RBIMethods {

	public void checkWithdrawalAmount(int withdrawalAmount) {
		if(withdrawalAmount>50000) {
			System.out.println("PAN card needed");
		} else {
			System.out.println("PAN card not needed");
		}
	}

	public double calculateInterest(double principalAmount,double years,double rateOfInterest) {
		double compoundInterest = principalAmount*Math.pow(1+rateOfInterest/100, years);
		return compoundInterest;
	}

}
