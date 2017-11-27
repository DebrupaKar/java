package counter;

import java.util.concurrent.TimeUnit;

public class CounterTest {
	public static void printMessage(String message) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " -> " + message);
	}

	private static class StaticCounter {
		private static int totalCount;
		
		public static int getTotal()
		{
			return totalCount;
		}
		
		public static synchronized void incTotalCount()
		{
			synchronized(StaticCounter.class)
			{
				printMessage("Start Incrementing");
				try {
					TimeUnit.SECONDS.sleep(2);
				 	} catch (InterruptedException e) {
				
				 		e.printStackTrace();
				 	}
				totalCount++;
				printMessage("Finish Incrementing");
				}
			}
	
	public static synchronized void decTotalCount()
	{
		synchronized(StaticCounter.class)
		{
			printMessage("Start Decrementing");
			try {
				TimeUnit.SECONDS.sleep(2);
			 	} catch (InterruptedException e) {
			
			 		e.printStackTrace();
			 	}
	
			totalCount--;
			
			printMessage("Finish Decrementing");
			}
		}
	}
		
//		public static synchronized void incTotalCount()
//		{
//			printMessage("Start Incrementing");
//			try {
//				 TimeUnit.SECONDS.sleep(2);
//				 } catch (InterruptedException e) {
//				
//				 e.printStackTrace();
//				 }
//			totalCount++;
//			printMessage("Finish Incrementing");
//		}
//		
//		public static void decTotalCount()
//		{
//			printMessage("Start Decrementing");
//			try {
//				 TimeUnit.SECONDS.sleep(2);
//				 } catch (InterruptedException e) {
//				
//				 e.printStackTrace();
//				 }
//			totalCount--;
//			printMessage("Finish Decrementing");
//		}
//
//	}

	public static void main(String[] args) {
	
		Runnable inc = () -> {
			StaticCounter.incTotalCount();
		};
		
		Runnable dec = () -> {
			StaticCounter.decTotalCount();
		};
		
		Thread thread1 = new Thread(inc,"Boy-1");
		Thread thread2 = new Thread(inc,"Boy-2");
		Thread thread3 = new Thread(dec,"Girl-1");
		Thread thread4 = new Thread(dec,"Girl-2");
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}
