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
//		ifCondition();
//		ifelseCondition();
//		nestedIfCondition();
//		ifElseIfLadder();
//		switchCase();
		breakContinue();
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

	static void ifElseIfLadder() {
		int a = 20;
		if (a > 20) {
			System.out.println("A is Greater");
		} else if (a == 5) {
			System.out.println("A is not equal to 10");
		} else if (a == 10) {
			System.out.println("A is equal to 10");
		} else {
			System.out.println("A is not present");
		}
	}

	static void switchCase() {
		int x = 9;
		for (int i = 0; i < x; i++) {
			switch (i) {
			case 0:
				System.out.println("i is :" + i);
				break;
			case 1:
				System.out.println("i is :" + i);
				break;
			case 2:
				System.out.println("i is :" + i);
				break;
			case 3:
				System.out.println("i is :" + i);
				break;
			case 4:
				System.out.println("i is :" + i);
				break;
			case 5:
				System.out.println("i is :" + i);
				break;
			case 6:
				System.out.println("i is :" + i);
				break;
			case 7:
				System.out.println("i is :" + i);
				break;
			default:
				System.out.println("I value is not in Switch");
//				return;
//				break;
			}
		}
	}

	static void breakContinue() {
//		for (int i = 0; i < 10; i++) {
//			if (i > 5) {
//				System.out.println("I value is : " + i);
//				break;
//				continue;
//			}
//		}

		for (int i = 0; i <= 5; i++) {
			if (i == 3) {
				continue;
			}
//			System.out.println(i);
		}

		for (int x = 1; x <= 3; x++) {
			for (int y = 1; y <= 3; y++) {
				if ((x == 2) & (y == 2)) {
					break;
//					continue;
				}
//				System.out.println(" " + x + " " + y);
			}
		}
//Labeled for loop
		aa: for (int i = 1; i < 4; i++) {
			bb: for (int j = 1; j < 4; j++) {
				if ((i == 2) && (j == 2)) {
					continue aa;
				}
//				System.out.println(" " + i + " " + j);
			}
		}

//		Continue statement with while loop
		int i = 1;
		while (i <= 10) {
			if (i == 5) {
				i++;
//				System.out.println("i in :"+i);
//				break;
				continue;
			}
//			System.out.println(i);
			i++;
		}

//		Continue statement in do while loop
		int c = 4;
		do {
			System.out.println(c);
			c++;
			continue;
		} while (c <= 5);

	}

}
