package doorListener;

public class Door 
{	
	DoorListener doorListener = new DoorListener();

	public Door() 
	{
		
	}

	public void doorOpen()
	{
		doorListener.functionOn();
		
	}
	
	public void doorClose()
	{
		doorListener.functionOff();
	}
}
