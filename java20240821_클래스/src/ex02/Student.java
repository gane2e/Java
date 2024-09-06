package ex02;

public class Student {

	//멤버변수는 private
	private String name;
	private int age;
	private String phone;
	
	//디폴트생성자
	Student(){
		System.out.println("디폴트 생성자 호출");
	}
	
	
	Student(String n) {//생성자 블록
		name = n;//필드 초기화
		age = 10; //기본값
		phone = "기본값";
	}
	
	
	Student(String n, int a) {//생성자 블록
		name = n;//필드 초기화
		age = a;
		phone = "기본값";
	}
	
	
	Student(String n, int a, String p) {//생성자 블록
		name = n;//필드 초기화
		age = a;
		phone = p;
	}
	
	
	void info() {
		System.out.printf("이름 : %s, 나이 : %d, 전화번호 : %s\n", name, age, phone);
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
