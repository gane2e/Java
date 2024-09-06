package ex03;

interface Printable{
	void print(String msg, int count); //추상메소드
	
}
/*
 * 람다
 * 1. 추상메소드가 1개만 존재해야 람다를 생성가능
 * 2. 매개변수 자료형 삭제 가능
 * 3. 매개변수가 1개 일 때는 중괄호 삭제가능
 * 4. 함수 몸체만 문장이 1개면 중괄호 생략 가능
 */
public class Lambda3 {
	


	
	public static void main(String[] args) {
		
		Printable p = (msg,  count) -> System.out.println(msg + ", " + count);
		
		p.print("이 문장 출력", 10);

	}

}
