package classobjects;

/**
 * @author subbaraop
 *
 */
// public class Employe {
abstract class Employe {
	// int rollNo = 10;
	// String name = "Subbu";
	static int rollNo;
	//final static int id = 3;
	String name;

	public static void main(String[] args) {
		// Employe e1 = new Employe();
		// e1.name = "Subbarao";
		// e1.rollNo = 0053;
		// System.out.println(e1.rollNo);
		// System.out.println(e1.name);
		System.out.println("Main method");
		rollNo = 12;
		//System.out.println(id + rollNo);

	}

	abstract void test1();

	 void test2() {
		System.out.println("Test 2 method from abstract class");
	}

	void finm1() {
		System.out.println("Final method");
	}
}
