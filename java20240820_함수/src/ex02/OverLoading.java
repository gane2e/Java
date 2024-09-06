package ex02;

public class OverLoading {

	public static void main(String[] args) {
	/*
	 * 오버라이딩(Overriding) ->상속
	 * 오버로딩(OverLoading) ->매개변수 다른 같은 이름 함수
	 */

		func(); //오버로딩, 매개변수가 맞는곳으로 찾아감
		func(5);
		func(5,12);
		func("얍");
		
	}

	static void func() {}
	static void func(int i) {}
	static void func(int i, int j) {}
	static void func(String s) {}
	
}
