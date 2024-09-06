package ex06;

interface Aable{}

class B implements Aable{};

class C{};

class Box<T extends Aable>{  //T 전달은 인터페이스를 상속하는 하위클래스만 가능함.
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
}


public class 인터페이스구현 {

	public static void main(String[] args) {
	
		
		Box<B> bBox = new Box<>();
//		Box<Aable> aBox = new Box<>(); ---------- 인터페이스는 객체생성 불가
		
		
		

	}

}
