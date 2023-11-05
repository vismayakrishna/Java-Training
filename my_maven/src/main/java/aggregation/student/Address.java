package aggregation.student;

public class Address {
	
	private String houseName;
	private int houseNumber;
	private String streetName;
	private Student std;
	
	public Address(String houseName, int houseNumber, String streetName,Student std) {
		this.houseName = houseName;
		this.houseNumber = houseNumber;
		this.streetName = streetName;
		this.std = std;
	}
	
	public void display() {
		System.out.println("---Student details---");
		System.out.println("Student Name: " + std.getStudentName());
		System.out.println("Roll number: " + std.getRollNumber());
		System.out.println("House Number: " + houseNumber);
		System.out.println("House Name: " + houseName);
		System.out.println("Street Name: " + streetName);
	}

}
