/**
 * 
 */
package com.subbu.tricky;

import java.util.Arrays;

/**
 * @author subbaraop
 *
 */
public class ArrayConcept {
	public static void main(String args[]) {
//		oneDimention();
//		arrayObjects();
//		multiDimentionalArray();
//		arrayTest();
//		jaggeArrays();
		compareArrays();
	}

	static void oneDimention() {
		// One dimensional Array
		int a1[] = { 1, 2, 3, 4, };
		for (int i = 0; i < a1.length; i++) {
			System.out.print(" " + a1[i]);
		}
	}

	static void arrayObjects() {
		// Create an Employee object to pass the data
		Employee[] em = new Employee[5];
		em[0] = new Employee(11, "Subbu");
		em[1] = new Employee(12, "siva");
		em[2] = new Employee(13, "Lucky");
		em[3] = new Employee(14, "ramya");
		em[4] = new Employee(15, "Siri");
		for (int i = 0; i < em.length; i++) {
			System.out.println("Student of " + i + " details are : " + em[i].emp_id + " --- " + em[i].emp_name);
		}
	}

	static void multiDimentionalArray() {
		int a[][] = { { 1, 2, 7 }, { 3, 4, 8 }, { 5, 6, 9 } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

	static void arrayTest() {
		int a[] = new int[2];
		System.out.println(a[0]);
		System.out.println(a[1]);
	}

	static void jaggeArrays() {
		int a[][] = new int[4][];
		a[0] = new int[1];
		a[1] = new int[2];
		a[2] = new int[3];
		a[3] = new int[4];
		int k = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < i + 1; j++) {
				a[i][j] = k;
				k++;
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

	static void compareArrays() {
		// To compare two arrays, use Arrays.equals() method.
		// For deep compare, use Arrays.deepEquals()
		// a.equals(b) is same as a==b
		int a[] = { 1, 2, 3 };
		int b[] = { 1, 2, 3 };
		if (Arrays.equals(a, b)) {
			System.out.println("Equal");
		} else
			System.out.println("Not Equal");
	}

	static void testing() {

	}
}

class Employee {
	public int emp_id = 1;
	public String emp_name = "subbarao";

	Employee(int emp_id, String emp_name) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}

}