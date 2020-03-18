/**
 * 
 */
package com.subbu.tricky;

/**
 * @author subbaraop
 *
 */
public class JavaOperators {
	public static void main(String[] args) {
//		assignment();
//		relationalOperator();
//		bitwiseOperator();
		unaryOperators();

	}

	static void assignment() {
		int a = 10;
		String name = "subbarao";
		// compound statement
		int score1 = 5;
		int score2 = 10;
		score1 += score2;
		score2 -= score1;
		System.out.println("Used compound statement : " + score1);
		System.out.println("Used compound statement : " + score2);
		System.out.println("Name of the Employee is :" + name + " Emp id is :" + a);
	}

	static void relationalOperator() {
		int x = 14, y = 16, z = 18;

//		if ((z > x) & (z < y)) {
//			System.out.println("X is smaller than Y and Z : " + x);
//		} else {
//			System.out.println("Y and Z are bigger values");
//		}

		if ((x >= y) && (x >= z)) {
			System.out.println("X is Greater Number");
		} else if ((y >= x) && (y >= z)) {
			System.out.println("Y is Greater Number");
		} else {
			System.out.println("Z is Greater Number");
		}
	}

	static void bitwiseOperator() {
		int a = 12;
		int b = 25;
		int c = a & b;
		System.out.println(c);

	}

	static void unaryOperators() {
		int a = 4;
		// Unary Minus (-)
		a = -a;
		System.out.println(a);

		// Not Operator (!)
		boolean cond = true;
		int val1 = 10, val2 = 20;
		System.out.println("without Not: " + cond + " With Not :" + !cond);
		System.out.println(!(val1 > val2));

		// Increment Operator(++)
		int inc = 6;
		System.out.println(inc++);
		System.out.println(++inc);

		// Decrement operator (--)
		int dec = 6;
		System.out.println(dec--);
		System.out.println(--dec);

		// Bitwise Operator (~)
		int bit = 2;
		System.out.println("bitwise value : " + ~bit);

		// Ternary Operator (?:)
		int v1 = 10, v2 = 20, max;
		max = (v1 < v2) ? ((v1 - v2) + 100) : (v2 - v1);
		System.out.println(max);
	}

	static void updownCasting() {
		System.out.println("Need Lucky help on this topic");
	}
}
