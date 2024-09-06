package ex02;

class StaticEx{
	int count = 0;
	static int cnt=0; //static 사용하면 여러곳에서 호출가능(공유가능)
	
	void func() {
		//인스턴스 변수, 클래스 변수 사용 가능, 인스턴스 메소드, 클래스 메소드 사용가능
	}
	
	static void sfunc() {
		//클래스 변수, 클래스 메소드만 사용 가능 // *****인스턴스 메소드, 인스턴스 변수 사용불가
	}
}


public class StaticMain {

	public static void main(String[] args) {
	
		StaticEx ex1 = new StaticEx();
		ex1.count++;
		StaticEx.cnt++;//클래스변수면 클래스명으로 호출하는게 보기좋음
		System.out.println(ex1.count + ", "+  ex1.cnt);
		
		StaticEx ex2 = new StaticEx();
		ex2.count++;
		ex2.cnt++;
		System.out.println(ex2.count + ", "+   ex2.cnt);
		
		StaticEx ex3 = new StaticEx();
		ex3.count++;
		ex3.cnt++;
		System.out.println(ex3.count + ", "+   ex3.cnt);
		

	}

}
