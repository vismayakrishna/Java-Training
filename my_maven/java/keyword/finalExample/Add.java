package keyword.finalExample;

public class Add {

	final int a;
	
	public Add() {
		a=10;
	}
	
//	private void show() {
//		System.out.println("Private methods cannot override");
//	}
	
	public final void display() {
		System.out.println("Final method example");
	}
	
	public void print() {
		System.out.println("Final keyword example");
	}
	
	

}
