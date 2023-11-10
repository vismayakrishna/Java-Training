package abstractExample;

public class SampleClass extends AbstractClass {
	
	public void show() {
		System.out.println("Method of sample class");
	}
	
	public void print() {
		System.out.println("Definition of abstract method");
	}

	public static void main(String[] args) {
		SampleClass obj = new SampleClass();
		obj.show();
		obj.print();
		obj.display();
	}

}
