package concurrency;

import java.util.concurrent.TimeUnit;

public class Concurrency {

	public static void printMessage(String message) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " -> " + message);
	}

	private static class Counter {
		private long c1 = 0;
		private long c2 = 0;

//		private Object key = new Object();
//		private Object boyKey = new Object(); //Keys not available to the outside world
//		private Object girlKey = new Object();
//
//		public void inc1() {
//			synchronized (key) {
//				printMessage("Increment");
//				 try {
//				 TimeUnit.SECONDS.sleep(3);
//				 } catch (InterruptedException e) {
//				
//				 e.printStackTrace();
//				 }
//				 c1++;
//				 printMessage("Increment finished");
//			}
//		}
//		
//		public void inc2() {
//			synchronized (key) {
//				printMessage("Increment");
//				 try {
//				 TimeUnit.SECONDS.sleep(1);
//				 } catch (InterruptedException e) {
//				
//				 e.printStackTrace();
//				 }
//				 c2++;
//				 printMessage("Increment finished");
//			}
//		}

		 public synchronized void inc1()
		 {
		 printMessage("Increment");
		 try {
		 TimeUnit.SECONDS.sleep(3);
		 } catch (InterruptedException e) {
		
		 e.printStackTrace();
		 }
		 c1++;
		 printMessage("Increment finished");
		 }
		
		 public synchronized void inc2()
		 {
		 printMessage("Increment");
		 try {
		 TimeUnit.SECONDS.sleep(1);
		 } catch (InterruptedException e) {
		
		 e.printStackTrace();
		 }
		 c2++;
		 printMessage("Increment finished");
		 }
	}

	public static void main(String[] args) {

		Counter counter = new Counter();

		Runnable first = () -> {
			counter.inc1();
		};

		Runnable second = () -> {
			counter.inc2();
		};

		Thread boyThread1 = new Thread(first, "boy-1");
		Thread boyThread2 = new Thread(first, "boy-2");

		Thread girlThread1 = new Thread(second, "girl-1");
		Thread girlThread2 = new Thread(second, "girl-2");

		boyThread1.start();
		boyThread2.start();
		girlThread1.start();
		girlThread2.start();
	}

}
