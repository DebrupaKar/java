import java.util.concurrent.TimeUnit;

public class EvenOdd {

	private static final Object LOCK = new Object();

	private static class EvenSequence {
		public void printEvenSequence() {
			synchronized (LOCK) {
				for (int i = 0; i <= 10; i++) {
					try {
						if (i % 2 != 0)

							LOCK.wait();

						else {
							System.out.println(i);
							LOCK.notify();
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	private static class OddSequence {
		public void printOddSequence() {
			synchronized (LOCK) {
				for (int i = 0; i < 10; i++) {
					try {
						if (i % 2 == 0)

							LOCK.wait();

						else {
							System.out.println(i);
							LOCK.notify();
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		EvenSequence e = new EvenSequence();
		OddSequence o = new OddSequence();

		Runnable odd = () -> {
			o.printOddSequence();
		};

		Runnable even = () -> {
			e.printEvenSequence();
		};

		Thread even1 = new Thread(even);
		Thread odd1 = new Thread(odd);

		odd1.start();
		even1.start();

	}

}