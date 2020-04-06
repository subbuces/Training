package classobjects;

public class ExceptoinOverridden {
	public static void main(String[] args) {
//		validation3
//		ThrowExceptions te = new ExceptoinOverridden();
//		te.validation3();
//		float f =5/0;
		try{
			badMethod();
			System.out.println("A");
		}catch(RuntimeException re){
			System.out.println("B");
		}catch(Exception ae){
			System.out.println("C");
		}
		finally{
			System.out.println("D");
		}
		System.out.println("E");
	}
	static void valaidation3(){
		System.out.println("");
	}
	static void badMethod(){
		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
