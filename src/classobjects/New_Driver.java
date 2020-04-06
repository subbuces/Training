package classobjects;

import java.util.ArrayList;
@persistant
public class New_Driver extends Driver {
	
	@Override
	public void dbDriver() {
		System.out.println("Type 4 Driver");
	}

	@SuppressWarnings(value = { "uncheckked" })
	public static ArrayList get_Customer_Details() {
		ArrayList list = new ArrayList();
		list.add("Subbu");
		list.add("Lucky");
		list.add("Siri");
		return list;
	}

	@Deprecated 
	public void gen_Salary() {
		System.out.println("Going to depricate this method");
	}

	public void gen_New_Salary() {
		System.out.println("New method to calculate the salary");
		System.out.println(empName);
	}
}
