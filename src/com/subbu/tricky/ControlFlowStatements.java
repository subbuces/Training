/**
 * 
 */
package com.subbu.tricky;

/**
 * @author subbaraop
 *
 */
public class ControlFlowStatements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ifCondition();
		ifelseCondition();
		nestedIfCondition();
	}

	static void ifCondition() {
		int i = 4;
		if (i > 6)
			System.out.println("4 is lesser than the 6");
		System.out.println("Out side statment. Not in If");
	}

	static void ifelseCondition() {
		int i = 4;
		if (i > 6) {
			System.out.println(i + " is Greater than 6");
		} else {
			System.out.println("6 is Greater than " + i);
		}
	}

	static void nestedIfCondition() {
		int i = 20;
		if (i == 20) {
			if (i < 10) {
				System.out.println(i + " value is less than the given condition");
			} else {
				System.out.println(i + " value is greater than the given condition");
			}
			if (i > 10) {
				System.out.println(i + " value is greater than the given condition");
			}
//				else {
//				
//			}
		}
	}
}
