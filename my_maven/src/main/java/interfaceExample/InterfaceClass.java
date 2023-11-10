package interfaceExample;

public class InterfaceClass implements SampleInterface {

	public void display() {
		System.out.println("Abstract method-1");
	}

	public void print() {
		System.out.println("Abstract method-2");
	}
	
	public void show() {
		System.out.println("Value: " + VALUE);
	}
	
	public static void main(String[] args) {
//		InterfaceClass obj = new InterfaceClass();
//		obj.display();
//		obj.print();
//		obj.show();
		
		SampleInterface obj = new InterfaceClass();
		obj.display();
		obj.print();
	}

	

}
