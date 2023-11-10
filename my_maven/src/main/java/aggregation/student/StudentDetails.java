package aggregation.student;

public class StudentDetails {

	public static void main(String[] args) {
		Student obj1 = new Student();
		obj1.setStudentName("Vismaya");
		obj1.setRollNumber(56);
		Address obj2 = new Address();
		obj2.setHouseName("Vishnumaya");
		obj2.setHouseNumber(811);
		obj2.setStreetName("Vaikom");
		obj2.setStd(obj1);
		obj2.display();
	}
}
