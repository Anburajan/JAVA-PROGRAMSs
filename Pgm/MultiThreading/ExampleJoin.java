package MultiThreading;

public class ExampleJoin {
	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("From t1..");

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("From t2..");

			}
		});

		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("From t3..");

			}
		});

		t1.start();

		t2.start();

		t3.start();

		/*t1.join();
		t2.join();
		t3.join();*/

		System.out.println("From Main..");

	}

}
