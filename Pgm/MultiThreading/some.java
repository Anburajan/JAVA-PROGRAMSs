package MultiThreading;

public class some {
	public static void main(String[] args) {

		final long startTime = System.currentTimeMillis();

		RunnableExample2 obj1 = new RunnableExample2();
		RunnableExample3 obj2 = new RunnableExample3();

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();

		while (t1.isAlive() || t2.isAlive()) {

		}

		final long endTime = System.currentTimeMillis();

		System.out.println("Total execution time: " + (endTime - startTime));
	}

}
