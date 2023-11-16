package rbiPackage;

public interface RBIMethods {

	public abstract void checkWithdrawalAmount(int withdrawalAmount);
	
	public abstract double calculateInterest(double principalAmount,double years,double rateOfInterest);
}
