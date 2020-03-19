/**
 * 1. Need more information on enum in singleton
 * 2. Yet to know more real time cases to use enum
 */
package com.subbu.tricky;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author subbaraop
 *
 */

enum Color {
	RED, BLUE, GREEN, YELLOW;
}

enum Day {

	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

	private Day() {
		System.out.println("Constructor called for : " + this.toString());
	}

	public void colorInfo() {
		System.out.println("Universal Color");
	}
}

public class BasicEnumarations {

	Color c;
	Day day;

//	constructor
	public BasicEnumarations(Day date) {
		this.day = date;
	}

	public void dayIsLike() {
		switch (day) {
		case MONDAY:
			System.out.println("Today is a :" + day);
			break;
		case TUESDAY:
			System.out.println("Today is a :" + day);
			break;
		default:
			System.out.println("TODAY IS A HOLIDAY");
			break;
		}
	}

	public static void main(String args[]) throws IOException {
		Color c1 = Color.BLUE;
		System.out.println(c1);
//		Day d1 = Day.SUNDAY;
//		d1.colorInfo();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the day : ");
		String str = br.readLine();
		BasicEnumarations be = new BasicEnumarations(Day.valueOf(str));
		be.dayIsLike();
		System.out.println("------");
		colorArray();
	}

	static void colorArray() {
		Color arr[] = Color.values();
		for (Color col : arr) {
			System.out.print("Ordinal VAl: " + col.ordinal());
			System.out.print(col.name());
			System.out.println(col.toString());
		}
	}

}
