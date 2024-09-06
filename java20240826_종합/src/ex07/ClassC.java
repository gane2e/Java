package ex07;

public class ClassC extends ClassB{
	
	private int c;
	
	public ClassC() {}
	public ClassC(int a, int b, int c){
		super(a,b);
		this.c = c;
	}
	
	void info() {
//		System.out.print(getA() + getB() + c);
		super.info();
		System.out.print(c + " ");
	}
}
