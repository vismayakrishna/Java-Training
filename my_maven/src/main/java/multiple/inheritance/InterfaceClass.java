package multiple.inheritance;

public class InterfaceClass implements SampleInterface1, SampleInterface2 {

	public int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

	public void display() {
		System.out.println("Display method from interface-1");
	}

	public void print() {
		System.out.println("Print method from interface-1");
	}

	public static void main(String[] args) {
		InterfaceClass obj = new InterfaceClass();
		obj.display();
		obj.print();
		System.out.println("Sum: " + obj.add(10, 45));
	}
}
