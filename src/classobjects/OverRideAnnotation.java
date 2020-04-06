package classobjects;

import java.util.ArrayList;

public class OverRideAnnotation {
	public static void main(String[] args) {
		Driver d = new New_Driver();
		d.dbDriver();
		New_Driver nd = new New_Driver();
//		nd.get_Customer_Details();
		ArrayList list = New_Driver.get_Customer_Details();
		System.out.println(list);
		
		nd.gen_Salary();
		nd.gen_New_Salary();
			
	}

}
