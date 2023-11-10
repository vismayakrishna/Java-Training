package polymorphism;

public class ChildClass extends ParentClass {

	public void print() {
		super.print();
		System.out.println("This is invoked from child class");
	}
	
	public void show() {
		System.out.println("Show method in child class");
	}
	
	public static void main(String[] args) {
//		ChildClass childClass = new ChildClass();
//		childClass.print();
//		childClass.display();
//		childClass.show();
		
		ParentClass obj = new ChildClass();
		obj.display();
		obj.print();
	}

}
