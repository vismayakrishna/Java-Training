package keyword.finalExample;

public class Add2 extends Add {
	
//	public final void display() {
//		System.out.println("final method cannot override but can inherit");
//	}

	public static void main(String[] args) {
		Add2 add2 = new Add2();
		add2.display();

	}
}
