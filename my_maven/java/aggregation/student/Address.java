package aggregation.student;

public class Address {
	
	private String houseName;
	private int houseNumber;
	private String streetName;
	private Student std;
	
	public String getHouseName() {
		return houseName;
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public Student getStd() {
		return std;
	}

	public void setStd(Student std) {
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
