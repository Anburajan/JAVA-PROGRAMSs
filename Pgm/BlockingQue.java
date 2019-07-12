import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQue {

	static BlockingQueue<Integer> bQueue = new ArrayBlockingQueue<Integer>(3);

	static int itemCount = 10;

	public static void main(String[] args) {
		new Thread(() -> produce()).start();
		new Thread(() -> consume()).start();

	}

	static void produce() {
		try {
			for (int i = 0; i <= itemCount; i++) {
				bQueue.put(i);
				System.out.println("Put : " + i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	static void consume() {
		try {
			Integer item;

			while (!((item = bQueue.take()) == 100)) {
				Thread.sleep(1000);
				System.out.println(item);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
