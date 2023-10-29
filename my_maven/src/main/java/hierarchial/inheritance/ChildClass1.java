package hierarchial.inheritance;

public class ChildClass1 extends ParentClass {

	public void print() {
		System.out.println("This is child class 1");
	}
	
	public static void main(String[] args) {
		ChildClass1 child1 = new ChildClass1();
		child1.display();
		child1.print();
	}

}
