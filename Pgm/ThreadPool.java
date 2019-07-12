import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
	public static void main(String[] args) {

		
		List<Runnable> tasks = new ArrayList<>();
		
		ExecutorService threadPool = Executors.newFixedThreadPool(5);
		
		tasks.add(() -> System.out.println("Task1 executed.."));
		tasks.add(() -> System.out.println("Task2 executed.."));
		tasks.add(() -> System.out.println("Task3 executed.."));
		tasks.add(() -> System.out.println("Task4 executed.."));
		tasks.add(() -> System.out.println("Task5 executed.."));
		tasks.add(() -> System.out.println("Task6 executed.."));
		tasks.add(() -> System.out.println("Task7 executed.."));
		tasks.add(() -> System.out.println("Task8 executed.."));
		tasks.add(() -> System.out.println("Task9 executed.."));
		tasks.add(() -> System.out.println("Task10 executed.."));
		
		/*for(Runnable task : tasks)		
		new Thread(task).start();*/
		
		// tasks.stream().forEach(task -> threadPool.execute(task));
		 tasks.stream().forEach(task ->new Thread(task).start());
		threadPool.shutdown();

	}
}
