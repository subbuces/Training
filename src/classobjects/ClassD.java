package classobjects;

public class ClassD {

	protected void m2() {
		System.out.println("m2 protwected method");
	}

	void m3() {

	}

}

class ClassF extends ClassD{
	public static void main(String[] args) {
		ClassD d = new ClassD();
		d.m2();
		ClassF f = new ClassF();
		f.m2();
		ClassD df = new ClassF();
		df.m2();
	}
}