package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {
	
	ArrayList<String> ls = new ArrayList<String>();
	//List<String> ls = new ArrayList<String>(); we can also declare like this

	public void listOperations() {
		ls.add("vismaya");
		ls.add("hari");
		ls.add("ammu");
		ls.add("ammu");  //duplication allowed
		ls.add("kichu");
		ls.add("malu");
		System.out.println("Array List before sorting: " + ls);
		
		ls.remove(2);
		System.out.println("Array List after removal: " + ls);
		
		Collections.sort(ls);
		System.out.println("Array List after sorting: " + ls);
		
		System.out.println("Iterating list using for-loop:");
		System.out.println("-----------------------");
		for(int i=0;i<ls.size();i++) {
			System.out.println(ls.get(i));
		}
		
		System.out.println();
		System.out.println("Iterating list using for-each loop:");
		System.out.println("-----------------------");
		for(String name:ls) {
			System.out.println(name);
		}
		
		System.out.println();
		System.out.println("Iterating list using iterator:");
		System.out.println("-----------------------");
		Iterator<String> it = ls.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public static void main(String[] args) {
		ArrayListExample obj = new ArrayListExample();
		obj.listOperations();
	}

}
