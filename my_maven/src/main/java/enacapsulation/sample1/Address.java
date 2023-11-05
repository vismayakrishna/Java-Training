package enacapsulation.sample1;

public class Address {
	
	String houseName;
	int houseNumber;
	String streetName;
	Student std;  //HAS-A relationship - aggregation
	
	public Address(String houseName, int houseNumber, String streetName,Student std) {
		this.houseName = houseName;
		this.houseNumber = houseNumber;
		this.streetName = streetName;
		this.std = std;
	}
	
	public void display() {
		System.out.println("---Student details---");
		System.out.println("Student Name: " + std.studentName);
		System.out.println("Roll number: " + std.rollNumber);
		System.out.println("House Number: " + houseNumber);
		System.out.println("House Name: " + houseName);
		System.out.println("Street Name: " + streetName);
	}
}
