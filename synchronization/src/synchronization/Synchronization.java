package synchronization;

import java.util.concurrent.TimeUnit;

public class Synchronization {

	public static void printMessage(String message) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " -> " + message);
	}

	private static class Building {
		public static synchronized void room1() {
			printMessage("in room 1");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			printMessage("Exiting room 1");
		}

		public synchronized void room2() {
			printMessage("in room 2");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			printMessage("Exiting room 2");
		}
	}

	public static void main(String[] args) {

		Building building = new Building();
		//Building building2 = new Building();

		// Runnable r1 = () -> {
		// building1.room1();
		// };
		//
		// Runnable r2 = () -> {
		// building1.room2();
		// };
		//
		// Runnable r3 = () -> {
		// building2.room1();
		// };

		Runnable r1 = () -> {
			Building.room1();
		};
		
		Runnable r2 = () -> {
			building.room2();
		};


		Thread thread1 = new Thread(r1, "Aneesh");
		Thread thread2 = new Thread(r2, "Mridul");
		Thread thread3 = new Thread(r2, "Arushi");

		thread1.start();
		thread2.start();
		thread3.start();
	}

}
