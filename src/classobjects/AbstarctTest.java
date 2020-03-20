/**
 * 
 */
package classobjects;

import java.lang.Math;

/**
 * @author subbaraop
 *
 */
abstract class Shape {
//	Instance Variable
	String color;

//	Abstract methods
	double area() {
		int radius = 10;
		return Math.PI * Math.pow(radius, 2);
	}

	public abstract String toString();

//	Constructor
	public Shape(String color) {
		this.color = color;
	}

//	Concrete Method
	public String getColor() {
		return color;
	}
}

class Circle extends Shape {
	/**
	 * @param color
	 */
	double radius;

	public Circle(String color, double radius) {
		super(color);
		System.out.println("Circle Constructor called");
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.pow(radius, 4);
	}

	@Override
	public String toString() {
		return "Circle Color is: " + super.color + " and area of the circle is :" + area();
	}
}

class Rectang extends Shape {
	/**
	 * @param color
	 */
	double length;
	double width;

	public Rectang(String color, double length, double width) {
		super(color);
		System.out.println("");
		this.length = length;
		this.width = width;
	}

	@Override
	double area() {
		return length * width;
	}

	@Override
	public String toString() {
		return "Rectangle color is " + super.color + " and area is : " + area();
	}
}

public class AbstarctTest {
	public static void main(String args[]) {
		Shape s1 = new Circle("Red", 4.4);
		Shape s2 = new Rectang("Blue", 4, 4);
		System.out.println(s1);
//		System.out.println(s2);

	}
}
