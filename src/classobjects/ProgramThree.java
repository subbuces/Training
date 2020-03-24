package classobjects;

public class ProgramThree extends ProgramTwo{

	public static void main(String[] args) {
		ProgramTwo PT = new ProgramTwo();
		ProgramOne PT1 = new ProgramOne("subbu", "sss", "fff");
		PT1.animal();
		PT.animal();
//		PT.Dog();
		
	}

}
