package ex05;

public class Main {

	public static void main(String[] args) {

		ClassA a = new ClassC();
//		a = new ClassB();
		a.func();
		
		ClassB b = (ClassB)a;
		b.func();
		
		((ClassB)a).func();
		
		ClassC c = new ClassC();
	}

}
