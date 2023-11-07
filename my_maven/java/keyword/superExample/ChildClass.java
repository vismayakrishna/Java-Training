package keyword.superExample;

public class ChildClass extends ParentClass {
	
	public ChildClass() {
		//super();
		this.dispaly1();
		System.out.println("This is a child class constructor");
	}

	public void dispaly1() {
		super.add();
		System.out.println("Child class");
		System.out.println("Invoked using super keyword "+super.num1);
	}

	public static void main(String[] args) {
		ChildClass childClass = new ChildClass();
		//childClass.add();
		//childClass.dispaly1();
		

	}

}
