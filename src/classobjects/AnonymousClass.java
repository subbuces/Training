/**
 * 
 */
package classobjects;

/**
 * @author subbaraop
 *
 */

public class AnonymousClass {
	void fact(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
			System.out.println("Factorial of " + i + " is " + fact);
		}
//		System.out.println("Factorial of "+n+" is "+fact);
	}

	public static void main(String args[]) {
		AnonymousClass ac = new AnonymousClass(), ac1 = new AnonymousClass();
		ac.fact(4);
		ac1.fact(5);
//		new AnonymousClass().fact(4);
	}

}
