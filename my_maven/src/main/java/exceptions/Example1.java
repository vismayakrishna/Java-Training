package exceptions;

public class Example1 {
	
	public void divide(int num1, int num2) {
		try {
			int result = num1/num2;
			System.out.println("Result: " + result);
			
			int arr[] = new int[5];
			for (int i = 0; i <= 5; i++) {
				arr[i] = i + 1;
				System.out.println(arr[i]);
			}
			System.exit(0);
		} catch (ArithmeticException e) {
			System.out.println("Division by zero is not possible");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array size exceeded");
		} catch (Exception e) {
			System.out.println("Exception occured!!");
		} finally {
			System.out.println("Finally block");
		}
		System.out.println("End of code");
	}

	public static void main(String[] args) {
		Example1 obj = new Example1();
		//obj.divide(10,0);
		obj.divide(10, 5);
	}

}
