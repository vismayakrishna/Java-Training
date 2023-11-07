package encapsulation.sample;

public class Customer {

	public static void main(String[] args) {
		Bank obj = new Bank();
		obj.setAccName("Vismaya");
		obj.setBalance(20000);
		obj.calculateInterest();
		System.out.println("Account holder: " + obj.getAccName());
		System.out.println("Account balance: " + obj.getBalance());

	}

}
