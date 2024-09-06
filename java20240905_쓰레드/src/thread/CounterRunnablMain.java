package thread;

public class CounterRunnablMain {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new CounterRunnabl(), "counter");
		thread.start();

	}

}
