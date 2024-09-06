package thread;

import static util.MyLogger.log;

class MyRunnable3 implements Runnable {
	
	public MyRunnable3(String msg, int time) {
		this.msg = msg;
		this.time = time;
	}
	
	private String msg;
	private int time;

	public void run() {
		try {
			while(true) {
				log(msg);
				Thread.sleep(time);
			}
		} catch (InterruptedException e) {
				e.printStackTrace();
		}

	}
}

public class ThreadMain05 {

	public static void main(String[] args) {
		
		Thread thread1 = 
				new Thread(new MyRunnable3("A", 1000), "Thread-A");
		Thread thread2 = 
				new Thread(new MyRunnable3("B", 500), "Thread-B");
		
		thread1.start();
		thread2.start();

	}

}
