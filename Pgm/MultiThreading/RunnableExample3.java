package MultiThreading;

public class RunnableExample3 implements Runnable {

	@Override
	public void run() {
		double result = 0;

		for (int i = 0; i < 1000000000; i++) {
			result = (i / 3.2) * 5.322321 / 7.4334343 % 6.3;
		}
		System.out.println(result);
	}

}
