package interfaceExample2;

public class InterfaceClass implements SampleInterface3 {

	public void display() {
		System.out.println("Display method from interface-1");
	}

	public void print() {
		System.out.println("Print method from interface-1");
	}

	public int add(int num1, int num2) {
		System.out.println("Add method from interface-2");
		int sum = num1 + num2;
		return sum;
	}

	public void show() {
		System.out.println("Show method from interface-3");
	}

	public static void main(String[] args) {
		InterfaceClass obj = new InterfaceClass();
		obj.display();
		obj.print();
		System.out.println("Sum: " + obj.add(10, 45));
		obj.show();
	}
}
