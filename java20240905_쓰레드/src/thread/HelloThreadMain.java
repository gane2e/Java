package thread;

public class HelloThreadMain {

	public static void main(String[] args) {
		
		//main 동작
		System.out.println(Thread.currentThread().getName() + "main() start");
		
		HelloThread helloThread = new HelloThread();
		
		System.out.println(Thread.currentThread().getName() + "start() 호출전");
		helloThread.start();//HelloThread스레드 호출
		System.out.println(Thread.currentThread().getName() + "start() 호출후");
		
		System.out.println(Thread.currentThread().getName() + "main() end");

	}

}
