package multilevel.inheritance;

public class Multiplication extends Subtraction {
	
	public void multiply() {
		int product = num1 * num2;
		System.out.println("Product = " + product);
	}

	public static void main(String[] args) {
		Multiplication mul = new Multiplication();
		mul.add();
		mul.subtract();
		mul.multiply();
	}

}
