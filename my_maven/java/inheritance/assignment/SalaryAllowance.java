package inheritance.assignment;

public class SalaryAllowance extends SalaryDivision {
	
	double hra;
	double pf;
	
	public SalaryAllowance(int basicPay, int deduction, int bonus) {
		super(basicPay, deduction, bonus);
	}
	
	public void calculateHra() {
		hra = 0.05*basicPay;
	}
	
	public void calculatePf() {
		pf = 0.2*basicPay;
	}
}
