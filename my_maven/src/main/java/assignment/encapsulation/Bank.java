package assignment.encapsulation;

public class Bank {

	private int pinNumber;

	public int getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	
	public void validatePin() {
		if(pinNumber==1001 || pinNumber==1234 || pinNumber==1212) {
			System.out.println("Valid Pin");
		} else {
			System.out.println("Invalid Pin");
		}
	}
}
