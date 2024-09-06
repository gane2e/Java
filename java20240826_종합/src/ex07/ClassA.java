package ex07;

public class ClassA {
	
	private int a;
	public ClassA(int a){
		this.a = a;
	}
	public ClassA(){
	}
	
	//getter -> int a -> int getA
	int getA() {
		return a;
	}

	void info() {
		System.out.print(a + " ");
	}
}
