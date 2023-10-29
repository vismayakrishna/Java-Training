package inheritance.assignment;

public class SalaryAllowance extends SalaryDivision {
	
	double hra;
	double pf;
	
	public void calculateHra() {
		hra = 0.05*basicPay;
	}
	
	public void calculatePf() {
		pf = 0.2*basicPay;
	}

}
