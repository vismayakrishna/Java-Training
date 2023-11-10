package exceptions;

import java.io.IOException;

public class Example2 {

	int sum;
	
	public void operation(int num1,int num2) throws IOException {
		sum = num1+num2;
		if(sum<15) {
			throw new ArithmeticException();
		} 
		else {
			//throw new NullPointerException();
			throw new IOException();
		}
	}
	
	public void display() throws IOException {
		operation(10,20);
		System.out.println("Sum: " + sum);
	}

	public static void main(String[] args) {
		Example2 obj = new Example2();
		try {
			obj.display();
		}
		catch (ArithmeticException e) {
			System.out.println("Sum less than 15");
		}
//		catch (NullPointerException e) {
//			System.out.println("Sum greater than 15");
//		}
		catch (IOException e) {
			System.out.println("IO Exception handled");
		}
		
	}

}
