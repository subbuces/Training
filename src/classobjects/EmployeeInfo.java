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

}
