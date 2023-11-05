package enacapsulation.sample1;

public class StudentDetails {

	public static void main(String[] args) {
		Student obj1 = new Student("Vismaya", 56);
		Address obj2 = new Address("Vishnumaya", 811, "Vaikom", obj1);
		obj2.display();
	}

}
