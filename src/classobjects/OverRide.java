package classobjects;

public class OverRide extends Bike{
	public static void main(String[] args) {
		Bike b = new Bike();
		b.model();
		Bike or = new Bike();
		Bike br = new OverRide();
		br.model();
		Bike or1= new Bike();
		or1.model();
		
		
	}
	void model(){
		System.out.println("Override class method");
	}
}

class Bike {
	void model(){
		System.out.println("Bike is a racer");
	}
}
