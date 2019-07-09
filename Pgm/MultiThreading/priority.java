package MultiThreading;

public class priority {
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

		t1.setPriority(10);
		t2.setPriority(3);
		t3.setPriority(2);

		System.out.println("From Main..");

	}

}
