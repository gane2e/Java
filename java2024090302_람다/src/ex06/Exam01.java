package ex06;

//매개변수가 있고, 반환형이 있는 경우
interface MaxInterface{
	int max(int num1, int num2);
}

public class Exam01 {

	public static void main(String[] args) {

		//익명 클래스
		MaxInterface max1 = new MaxInterface() {
			
			@Override
			public int max(int num1, int num2) {
				return (num1 > num2) ? num1 : num2 ;
			}
		};
		
		//람다
		//중괄호가 있으면 리턴ㅇ, 없으면 리턴x
		MaxInterface max2 = ( num1,  num2) -> {
			return (num1 > num2) ? num1 : num2 ;
		};
		System.out.println(max1.max(5, 1));
		System.out.println(max2.max(5, 11));
	}

}
