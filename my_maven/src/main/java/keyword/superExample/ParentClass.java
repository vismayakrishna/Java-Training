package keyword.superExample;

public class ParentClass {
	
	int num1 = 10;
	int num2 = 20;
	
	public ParentClass() {
		System.out.println("This is a parent class constructor");
	}

	public void add() {
		int sum = num1 + num2;
		System.out.println("Sum: " + sum);
	}

}
