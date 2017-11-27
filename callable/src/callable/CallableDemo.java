package callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CallableDemo {

	public static void main(String[] args) {
		
		
		
		/*Creates thread each time a task is scheduled*/
		Runnable task = () -> {
			String name = Thread.currentThread().getName();
			System.out.println(name + "-> start task");
			try {
				TimeUnit.SECONDS.sleep(2);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(name + "-> end task");
		};
		
//		
//			for(int i=0 ; i<10 ; i++)
//			{
//				new Thread(task).start();
//			}
		
		
		/* Executes the tasks using a single thread */
		
//		ExecutorService service = Executors.newSingleThreadExecutor();
//		
//		for(int i=0 ; i<10 ; i++)
//		{
//			service.execute(task);
//		}
		
		ExecutorService service = Executors.newFixedThreadPool(4);
		
		

	}

}
