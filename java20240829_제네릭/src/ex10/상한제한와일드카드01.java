package ex10;


class Box<T>{  
	private T obj;

	public T getObj() {	return obj; }
	public void setObj(T obj) { this.obj = obj;}
	
	@Override
	public String toString() {
		return obj.toString();
	}
	
}

class BoxFactory{

	//제네릭 메서드
	public static <T> T openBox(Box<T> box){
		return box.getObj();
	}

	//Box<? extends Number> => 와일드 카드 상한 제한
	public static void peekBox(Box<? extends Number>box) {
		System.out.println(box);
	}
	
}

public class 상한제한와일드카드01 {

	public static void main(String[] args) {


		Box<Integer> iBox = new Box();
		iBox.setObj(1234);
		
		Box<Double> dBox = new Box();
		dBox.setObj(12.15);
		
		Box<String> sBox = new Box();
		sBox.setObj("korea");
		
		BoxFactory.peekBox(iBox);
		BoxFactory.peekBox(dBox);
//		BoxFactory.peekBox(sBox);
		
	}
}
