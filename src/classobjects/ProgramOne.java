package classobjects;

public class ProgramOne {
	final int a = 10;
	String city, state, country;

	public ProgramOne(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public static void main(String[] args) {
		int b = 20;
		float sal = 100;
		test();
		ProgramTwo po = new ProgramTwo();
		po.blockOne();
		// ProgramTwo po1 = (ProgramTwo)
		// Class.forName("classobjects").newInstance();
		// po1.blockOne();
	}

	public static void test() {
		int b = 20;
		float sal = 100;
		System.out.println("P1 Test method");
	}

	public void animal() {
		String name = "Dog";
		int age = 3;
		System.out.println("Name of the Animal is :" + name + " Age is:" + age);
	}
}