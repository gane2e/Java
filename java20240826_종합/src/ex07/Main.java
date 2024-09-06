package ex07;

public class Main {

	public static void main(String[] args) {
		
		ClassC c = new ClassC(10,20,30);
		c.info();

		func(new ClassA());
		func(new ClassB());
		func(new ClassC());
	}
	
	static void func(ClassA a) {
//		ClassC c = (ClassC)a;
		
		if(a instanceof ClassC) {//참조중인클래스 체크
			System.out.println("aaa");
			ClassC c = (ClassC)a;
		}else if(a instanceof ClassB) {
			System.out.println("bbb");
			ClassB c = (ClassB)a;
		}
	}

}
