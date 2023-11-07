package assignment.encapsulation;

public class Bank {

	private int pinNumber;

	public void getPinNumber() {
		if(validatePin()) {
			System.out.println("Valid Pin");
		} else {
			System.out.println("Invalid Pin");
		}
	}

	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	
	public boolean validatePin() {
		if(pinNumber==1001 || pinNumber==1234 || pinNumber==1212) {
			return true;
		} else {
			return false;
		}
	}
}
