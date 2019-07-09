package MultiThreading;

public class RunnableExample implements Runnable {
	public static void main(String[] args) {

		final long startTime = System.currentTimeMillis();

		RunnableExample obj = new RunnableExample();

		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);

		t1.start();
		t2.start();
	
		while(t1.isAlive() ||t2.isAlive()) {
			
		}

		
			
			
			final long endTime = System.currentTimeMillis();

		System.out.println("Total execution time: " + (endTime - startTime));
	}

	@Override
	public void run() {
		double result = 0;

		for (int i = 0; i < 1000000000; i++) {
			result = (i / 3.2) * 5.322321 / 7.4334343 % 6.3;
		}
		System.out.println(result);

	}

}
