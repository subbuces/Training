package classobjects;

public class OverLoad {
	public static void main(String[] args) {
		OverLoad obj = new OverLoad();
		obj.sum(10, 20);
		obj.sum(10, 20, 30);
		obj.sum(20, 30);
	}
	void sum(int a,int b){
		System.out.println(a+b);
	}
	void sum(long a,int b){
		System.out.println(a+b);
	}
	void sum(int a,int b,int c){
		System.out.println(a+b+c);
	}
}
//class SampleOver{
//	
//}