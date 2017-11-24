package enginepackage;

public class Engine {
	
	String make;
	String model;
	
	public Engine(String make, String model) {
		super();
		this.make = make;
		this.model = model;
	}
	
	
	
	public void startEngine()
	{
		System.out.println("Engine starting");
		System.out.println(this);
	}

}
