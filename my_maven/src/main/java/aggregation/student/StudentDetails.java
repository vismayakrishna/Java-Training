package aggregation.student;

public class StudentDetails {

	public static void main(String[] args) {
		Student obj1 = new Student("Vismaya", 58);
		Address obj2 = new Address("Vishnumaya", 811, "Vaikom", obj1);
		obj2.display();
	}
}
