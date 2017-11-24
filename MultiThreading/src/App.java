import java.util.concurrent.TimeUnit;

public class App 
{
	public static void printThreadMessage(String message) 
	{
		String threadName = Thread.currentThread().getName();
		//System.out.format("%s : $s%n", threadName, message);
		System.out.println(threadName + " : " + message);
	}

	private static class ProgramLoop implements Runnable {
		@Override
		public void run() {
			try {
				for (int i = 0; i < 15; i++) {

					TimeUnit.SECONDS.sleep(2);
					printThreadMessage(String.valueOf(i));
					
				}
			} catch (InterruptedException e) {

				printThreadMessage("I wasn't done.");
			}

		}
	}

	public static void main(String[] args) throws InterruptedException {
		printThreadMessage("Starting programLooping Thread");
		Thread thread = new Thread(new ProgramLoop(), "student");
		thread.start();

		printThreadMessage("Waiting for ProgramLoop thread to finish");

		while (thread.isAlive()) {
			printThreadMessage("Still waitng..");
			thread.join(15 * 1000);

			if (thread.isAlive()) {
				printThreadMessage("Interrupting");
				thread.interrupt();
				break;
			}
		}
		printThreadMessage("Finally..We are moving towards new topic");
	}
}
