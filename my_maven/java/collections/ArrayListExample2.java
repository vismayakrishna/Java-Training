package collections;

import java.util.ArrayList;

public class ArrayListExample2 {
	
	ArrayList<String> colors = new ArrayList<String>();
	
	public void addElements() {
		colors.add("Black");
		colors.add("White");
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Blue");
		colors.add("Orange");
	}
	
	public void printArrayList() {
		System.out.println("Colours List: " + colors);
	}
	
	public void retrieveElement() {
		System.out.println("Retreieved Element: " + colors.get(2));
	}
	
	public void iterateArray() {
		for(String color:colors) {
			System.out.println(color);
		}
	}
	
	public void removeElement() {
		System.out.println("Removed Element: " + colors.remove(2));
	}
	
	public void searchElement() {
		System.out.println("Searched element present: " + colors.contains("White"));
	}
	
	public static void main(String[] args) {
		ArrayListExample2 obj = new ArrayListExample2();
		obj.addElements();
		obj.printArrayList();
		obj.retrieveElement();
		System.out.println("Iterating list:");
		System.out.println("-----------------------");
		obj.iterateArray();
		obj.removeElement();
		obj.searchElement();
	}

}

 
