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
//		jaggedArrays();
//		compareArrays();
//		arrayIteration();
//		foreachLoop();
//		insertArrayElements();
//		removeIndexArray();
//		minMaxValue();
//		copyArrays();
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

	static void jaggedArrays() {
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

	static void arrayIteration() {
//		String array type iteration
		String strarray[] = new String[10];

		for (int i = 0; i < strarray.length; i++) {
			strarray[i] = "String of " + i;
		}
		for (int i = 0; i < strarray.length; i++) {
			System.out.println(strarray[i]);
		}

//		int array type iteration
		int[] intarray = new int[5];
		for (int i = 0; i < intarray.length; i++) {
			intarray[i] = i;
		}
		for (int i = 0; i < intarray.length; i++) {
			System.out.println(intarray[i]);
		}
	}

	static void foreachLoop() {
		int a[] = { 1, 2, 3 };
		for (int x : a) {
			if (x == 1) {
				a[2] = 2;
				System.out.println(a[x]);
			}
			System.out.println(x);
		}
	}

	static void insertArrayElements() {
		int[] ints = new int[20];

		int insertIndex = 10;
		int newValue = 123;

		// move elements below insertion point.
//		for (int i = ints.length - 1; i > insertIndex; i--) {
//			ints[i] = ints[i - 1];
//		}

		// insert new value
		ints[insertIndex] = newValue;

		System.out.println(Arrays.toString(ints));
	}

	static void removeIndexArray() {
//		int ints[] = new int[20];
		int ints[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
		int removeindex = 9;
		for (int i = removeindex; i < ints.length - 1; i++) {
			ints[i] = ints[i + 1];
			System.out.println(ints[i]);
//			System.out.println(i);
		}
	}

	static void minMaxValue() {
//		int ints[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
//		int minvalue = Integer.MAX_VALUE;
//		System.out.println(minvalue);
//		for(int i=0;i<ints.length;i++) {
//			if(ints[i]<minvalue)
//				minvalue = ints[i];
//			System.out.println(minvalue);
//		}

		int[] ints = { 0, 2, 4, 16, 8, 10 };
		int maxVal = Integer.MIN_VALUE;
//		System.out.println(maxVal);
		for (int i = 0; i < ints.length; i++) {
			if (ints[i] > maxVal) {
				System.out.println("inner" + maxVal);
				maxVal = ints[i];
			}
		}
		System.out.println("maxVal = " + maxVal);
	}

	static void copyArrays() {
		int source[] = new int[10];
//		int dest[] = new int[10];

		for (int i = 0; i < source.length; i++) {
			int a = 10;
			source[i] = a + i;
		}
//		int dest[] = Arrays.copyOfRange(source, 2, source.length);
		int dest[] = Arrays.copyOf(source, source.length);
		for (int j = 0; j < source.length; j++) {
			System.out.println(dest[j]);
		}
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