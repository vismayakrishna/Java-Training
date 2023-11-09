package exceptions;

public class Example2 {

	public void operation(int num1,int num2) throws ArithmeticException,NullPointerException {
		int sum = num1+num2;
		System.out.println("Sum: " + sum);
		
		if(sum<15) {
			throw new ArithmeticException();
		} else {
			throw new NullPointerException();
		}
	}

	public static void main(String[] args) {
		Example2 obj = new Example2();
		obj.operation(10,20);
	}

}
