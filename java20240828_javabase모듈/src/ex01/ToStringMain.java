package ex01;

class A{
	int age = 10;
	String name = "홍길동";
	
	@Override
	public String toString() {
		return "A [age=" + age + ", name=" + name + "]";
	}
	
	
}

public class ToStringMain {

	public static void main(String[] args) {

		Object obj = new A();
		
		System.out.println(obj.toString());
		System.out.println(obj);
		
	}

}
