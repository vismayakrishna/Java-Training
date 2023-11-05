package encapsulation.sample;

public class EncapsulationClass {

	private int age;
	private String name;
	
	public void setter(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public void getter() {
		System.out.println("Age: " + age);
		System.out.println("Name: " + name);
	}
}
