package classobjects;

public class NestedTryBlocks {
	public static void main(String[] args) {
		try{
			try{
				int a = 100/0;
			}catch(ArithmeticException ae){
				System.out.println("Arithmetic Exception: " + ae);
			}
			
			try{
				String a = null;
				System.out.println(a.length());
			}catch(NullPointerException np){
				System.out.println("String Value shouldnot be null: "+ np);
			}
			
			try{
				int a[] = new int[5];
				a[6] = 4;
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Array out of bounds : "+e);
			}
			
		}catch(Exception e){
			System.out.println("Exceptions handled");
		}
		
		finally{
			System.out.println("Rest of code 1");
			System.out.println("Rest of code 2");
			System.out.println("Rest of code 3");
			System.out.println("Rest of code 4");
		}
	}

}
