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
	
	public void retrieveElement(int index) {
		System.out.println("Retreieved Element: " + colors.get(index));
	}
	
	public void iterateArray() {
		for(String color:colors) {
			System.out.println(color);
		}
	}
	
	public void removeElement(int index) {
		System.out.println("Removed Element: " + colors.remove(index));
	}
	
	public void searchElement(String element) {
		boolean flag=false;
		for(String color:colors) {
			if(color.equalsIgnoreCase(element)) {
				flag = true;
			}
		}
		if(flag) {
			System.out.println(element+" is present");
		} else {
			System.out.println(element+" is not present");
		}
	}
}

 
