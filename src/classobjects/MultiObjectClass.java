/**
 * 
 */
package classobjects;

/**
 * @author subbaraop
 *
 */

class Rectangle {
//	Instance Variables
	int length;
	int width;

	void insert(int length, int width) {
		this.length = length;
		this.width = width;
	}

	void display() {
		System.out.println(length * width);
	}
}

public class MultiObjectClass {
//	instance Variables
	static int a;
	int b = 10;

	public static void main(String args[]) {
		Rectangle ra = new Rectangle();
//		local variables
		int x = 2;
		ra.insert(3, 4);
		ra.display();
		MultiObjectClass moc = new MultiObjectClass();
		System.out.println(moc.a + moc.b);
		moc.a = 25;
		moc.b = 30;
		System.out.println(moc.a + moc.b);
	}

}
