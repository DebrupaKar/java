package doorListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoorTest 
{
	public static void main(String args[])
	{
	
		Door d = new Door();
		
		String option;
		
		Scanner s = new Scanner(System.in);
		
		DoorListener lights = new DoorListener();
		DoorListener ac = new DoorListener();
		DoorListener fan = new DoorListener();
		
		List<DoorListener> objects = new ArrayList<DoorListener>();
		
		objects.add(lights);
		objects.add(ac);
		objects.add(fan);
		
		System.out.println("Do you want to open or close the door? Enter o or c");
		option = s.next();
		
		if(option.equals("o"))
		{
			for(DoorListener listener : objects)
			{
				d.doorOpen();
	
			}
		}
		else if(option.equals("c"))
		{
			for(DoorListener listener : objects)
			{
				d.doorClose();
			}
		}
		
		s.close();
	}
}
