package ex01;

public class ex01 {

	public static void main(String[] args) {

		Student 철 = new Student();//객체생성
		
//		철.나이 = 50;
//		철.이름 = "김대철";
//		철.전화번호 = "010-3380-6423";
//		철.info();
		
		/*
		 * 멤버변수는 외부에 공개하지 않음
		 * int = a;
		 * a = 10;
		 * sysout print (a) -> a변수를 초기화해야 사용 가능하다.
		 * 마찬가지로 멤버변수를 반드시 초기화해야한다,
		 * 초기화하는 방법 2가지
		 * 1.생성자, 2.setter 이용해서 멤버변수 초기화한다.
		 *  
		 */
		Student 가은 = new Student();//다른객체생성(클래스를참조하는새로운객체생성)
//		가은.나이 = 22;
//		가은.이름 = "김가은";
//		가은.전화번호 = "010-1234-1234";
//		가은.info();
		

	}
/*
 * [접근제어자] private, default, protected, public 
 * private -> 같은 클래스 내에서만 공개
 * default -> 같은 패키지 내에서만 공개
 * protected -> 다른 패키지에서도 상속하면 공개
 * public -> 모두 공개 
 */

}
class Student{ // 클래스명 첫글자 = 대문자 , 변수 및 함수는 소문자
	
	//멤버변수는 private
	private String 이름;
	private int 나이;
	private String 전화번호;
	
	void info() {
		System.out.printf("이름 : %s, 나이 : %d, 전화번호 : %s\n", 이름, 나이, 전화번호);
	}
	
	void 입실() {
		System.out.println("입실하다.");
	}
	void 퇴실() {
		System.out.println("퇴실하다.");
	}
	void 조퇴() {
		System.out.println("조퇴하다.");
	}
}