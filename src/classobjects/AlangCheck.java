package classobjects;

//import package1.ClassA;
public class AlangCheck {
	public static void main(String[] args) {
		System.out.println("Test");
		// ClassA ca = new ClassA();
		// Bank dd = new Bank();
	}
	public final void finalMethod(){
		System.out.println("Final method from Classobjects");
	}
	

	public class T1 {
		public void m1() {
			System.out.println("classobjects : M1 method");
		}
	}

	private class T2 {
		void m2() {
			System.out.println("classobjects : M2 method");
		}
	}

	protected class T3 {
		void m3() {
			System.out.println("classobjects : M3 method");
		}
	}

	final class T4 {
		void m4() {
			System.out.println("classobjects : M4 method");
		}
	}

	abstract class T5 {
		void m5() {
			System.out.println("M5 method");
		}

		abstract void m6();
	}

	static class T6 {
		void m6() {
			System.out.println("M6 method");
		}
	}
}
