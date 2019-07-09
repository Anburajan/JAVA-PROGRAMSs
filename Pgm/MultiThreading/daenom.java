package MultiThreading;

public class daenom {
	
public static void main(String[] args) {
	
	Thread t1 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			for(;;){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				System.out.println("AR..");
			}
			
		}
	});
	
	Thread t2 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
			}
			System.out.println("From t2..");
			
		}
	});
	
	t1.setDaemon(true);
	t1.start();
	t2.start();
	
}

}
