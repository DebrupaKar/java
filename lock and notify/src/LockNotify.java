import java.util.concurrent.TimeUnit;

public class LockNotify {

	public static void printMessage(String message) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " -> " + message);
	}

	private static int count = -1;
	private static int BUFFER_SIZE = 1;
	public static final int[] BUFFER = new int[BUFFER_SIZE];

	private static final Object LOCK = new Object();

	public static boolean isFull() {
		return count == (BUFFER_SIZE - 1);
	}

	public static boolean isEmpty() {
		return count == -1;
	}

	private static class Producer {
		public void producer() {
			synchronized (LOCK) {
				while (true) {
					if (isFull()) {
						printMessage("Buffer -> full, going to wait");
					try {
						LOCK.wait();
						TimeUnit.SECONDS.sleep(2);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					}

					++count;
					BUFFER[count] = (int) (Math.random() * 100);

					printMessage("Produced " + BUFFER[count] + "new item and notifying consumer");
					LOCK.notify();
				}
			}
		}
	}

	private static class Consumer {
		public void consumer() {
			synchronized (LOCK) {
				while (true) {
					if (isEmpty()) {
						printMessage("Buffer -> empty, going to wait");
						try {
							LOCK.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					try {
						
						TimeUnit.SECONDS.sleep(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					printMessage("Consumed " + BUFFER[count] + " an item and notifying other");

					BUFFER[count] = 0;
					count--;

					LOCK.notify();
				}
			}
		}
	}

	public static void main(String[] args) {

		Producer producer = new Producer();
		Consumer consumer = new Consumer();

		Runnable p = () -> {
			producer.producer();
		};

		Runnable c = () -> {
			consumer.consumer();
		};

		Thread p1 = new Thread(p);
		Thread c1 = new Thread(c);

		p1.start();
		c1.start();

	}

}
