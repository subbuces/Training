package classobjects;

public class ThrowExceptions {
	public static void main(String[] args) {
		validation2();

	}

	static void validate(int a) {
		if (a < 18) {
			throw new ArithmeticException();
		} else {
			System.out.println("Allow above 18 years person to Vote");
		}
	}

	static void validation1() {
		try {
			validate(4);
		} catch (Exception e) {
			System.out.println("Exception handeled in 1st place");
		}
	}

	static void validation2() {
		try {
			validation1();
		} catch (Exception e) {
			System.out.println("Exception handeled in 1st place");
		}

	}
	
	void validation3(){
		int a = 100/0;
		System.out.println("Testing");
	}
}
