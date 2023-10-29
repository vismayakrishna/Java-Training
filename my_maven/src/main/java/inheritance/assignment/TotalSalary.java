package inheritance.assignment;

public class TotalSalary extends SalaryAllowance {
	
	double totalSalary;
	
	public void calculateTotalSalary() {
		totalSalary = basicPay+hra-pf-deduction+bonus;
	}
	
	public void getSalarySlip() {
		System.out.println("Basic Pay: " + basicPay);
		System.out.println("Deduction: " + deduction);
		System.out.println("HRA: " + hra);
		System.out.println("PF: " + pf);
		System.out.println("Bonus: " + bonus);
		System.out.println("Total Salary: " + totalSalary);
	}

	public static void main(String[] args) {
		TotalSalary totalSalary = new TotalSalary();
		totalSalary.getSalaryDivision();
		totalSalary.calculateHra();
		totalSalary.calculatePf();
		totalSalary.calculateTotalSalary();
		totalSalary.getSalarySlip();
	}

}


