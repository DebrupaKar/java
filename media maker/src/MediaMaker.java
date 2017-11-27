import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MediaMaker {

	private static volatile boolean change = true;
	
	public static void main(String[] args) {
		
		Runnable MediaPlayer = () -> {
			
			while(change == true) 
			{
				System.out.println("Playing");
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}	
		};
		
		Runnable StopPlayer = () -> {
			
			Scanner s = new Scanner(System.in);
			String pause = s.nextLine();
			
			if(pause.equals(""))
			{
				change = false;
				System.out.println("Stopped");
			}
			
			s.close();
		};

		Thread play = new Thread(MediaPlayer);
		Thread stop = new Thread(StopPlayer);

		play.start();
		stop.start();
	}
	
}
