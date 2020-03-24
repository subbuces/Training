package classobjects;

public class ProgramTwo extends ProgramOne {
	int empId;
	String empName;
	String section;
	ProgramOne address;

	public void ProgramTwo(int empID, String empName, String section) {
		this.empId = empId;
		this.empName = empName;
		this.section = section;
	}
	public void display(){
		System.out.println("Emp name"+empName);
	}

	public static void main(String[] args) {
		System.out.println("");
		ProgramOne po = new ProgramOne();
		po.test();
		int x = 200;
		x = po.a + x;
		System.out.println(x);
	}

	static void blockOne() {
		System.out.println("Block One method from Program Two");
	}

	void Dog() {
		String barks = "yes";
		System.out.println("Dogs with 3 years will bark? :" + barks);
	}

	public void animal() {
		String name = "Dog";
		int age = 3;
		System.out.println("Name of the Animal is :" + name + " Age is:" + age);
	}
}
