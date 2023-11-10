package hierarchial.inheritance;

public class ChildClass2 extends ParentClass {
	
	public void print() {
		System.out.println("This is child class 2");
	}

	public static void main(String[] args) {
		ChildClass2 child2 = new ChildClass2();
		child2.display();
		child2.print();

	}

}
