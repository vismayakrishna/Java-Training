package inheritance;

public class ChildClass extends Parent {
	
	public void print() {
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		ChildClass child = new ChildClass();
		child.display();
		child.print();
		System.out.println(child.name);
	}

}
