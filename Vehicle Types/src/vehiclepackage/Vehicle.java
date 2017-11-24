package vehiclepackage;
import enginepackage.*;

public class Vehicle {
	
	int maxSpeed;
	int engine;
	public Vehicle(int maxSpeed, int engine) {
		super();
		this.maxSpeed = maxSpeed;
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Vehicle [maxSpeed=" + maxSpeed + ", engine=" + engine + "]";
	}

	public void start()
	{
		System.out.println("Car starting");
		System.out.println(this);
	}
	
	
}

