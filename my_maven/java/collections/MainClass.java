package collections;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayListExample2 obj = new ArrayListExample2();
		obj.addElements();
		System.out.println("Printing Array list:");
		System.out.println("-----------------------");
		obj.printArrayList();
		System.out.println();
		System.out.print("Enter the index of element to be retrieved: ");
		int index1 = sc.nextInt();
		obj.retrieveElement(index1);
		System.out.println();
		System.out.println("Iterating list:");
		System.out.println("-----------------------");
		obj.iterateArray();
		System.out.println();
		System.out.print("Enter the index of element to be removed: ");
		int index2 = sc.nextInt();
		obj.removeElement(index2);
		System.out.println();
		System.out.print("Enter the element to be searched: ");
		String element = sc.next();
		obj.searchElement(element);
		sc.close();

	}

}
