package classobjects;

/**
 * @author subbaraop
 *
 */
public class Employe {
//	int rollNo = 10;
//	String name = "Subbu";
	int rollNo;
	String name;

	public static void main(String[] args) {
		Employe e1 = new Employe();
		e1.name = "Subbarao";
		e1.rollNo = 0053;
		System.out.println(e1.rollNo);
		System.out.println(e1.name);
	}
}
