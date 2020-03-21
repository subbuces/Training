package classobjects;

abstract class demo {
	public int a;

	demo() {
		a = 10;
	}

	abstract public void set();

	// can't use final keyword for abstarct method
	abstract final public void get();

}

class Test extends demo {

	public void set(int a) {
		this.a = a;
		// how java is getting the variable a data from super class without
		// super keyword?
	}

	final public void get() {
		System.out.println("a = " + a);
	}

	public static void main(String[] args) {
		Test obj = new Test();
		obj.set(20);
		obj.get();
	}

}