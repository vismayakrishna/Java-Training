package multilevel.inheritance;

public class ChildClass2 extends ChildClass1 {
	
	public void show() {
		System.out.println("This is child class 2");
	}
	
	public static void main(String[] args) {
		ChildClass2 child = new ChildClass2();
		child.print();
		child.display();
		child.show();

	}

}
