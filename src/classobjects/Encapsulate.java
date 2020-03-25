package classobjects;

public abstract class Encapsulate {
	
	Encapsulate(){
		System.out.println("Encapsulate constructor ");
	}
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	abstract void method1();
}
