package classobjects;

public class ClassE {
	public static void main(String[] args) {
		try {
//			ClassE x  = new ClassE();
//			x.m1();
			int data[] = {1,2,3,4,5};
			System.out.println(data[10]);
			System.out.println("remaining Code");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("Can't devided by Zero");
		}
		catch(NullPointerException n){
			System.out.println(n);
			
		}finally{
			System.out.println("Final Block");
		}
		System.out.println("out of try, catch and finally block");
		
	}

	 void m1() {
		int a =0 , b;
		a += 10;
		String s = null;
		System.out.println(s.length());

	}
}
