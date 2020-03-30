package package1;
import classobjects.*;
//import classobjects.AlangCheck.T1;
class ClassA extends AlangCheck{
	public static void main(String[] args) {
		System.out.println("Package1 statement");
		AlangCheck.T1 ac =new AlangCheck().new T1();
		ac.m1();
	}

	public void testing() {
		System.out.println("Testing method from pack1");
	}
}
