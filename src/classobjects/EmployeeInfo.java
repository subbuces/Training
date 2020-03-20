/**
 * 
 */
package classobjects;

/**
 * @author subbaraop
 *
 */
class empinfo {
//	int id = 01;
//	String name = "Subbu";
//	String Dept = "QA";

	int id;
	String name;
	String dept;

	void inserRecord(int id, String name, String dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	void displayInformation() {
		System.out.println(" " + id + " " + name + " " + dept);
	}
}

public class EmployeeInfo {
	public static void main(String args[]) {
		empinfo ei = new empinfo();
		ei.inserRecord(10, "subbarao", "QA");
		ei.displayInformation();
	}

}
