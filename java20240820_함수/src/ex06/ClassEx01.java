package ex06;

import java.util.Scanner;

public class ClassEx01 {

	public static void main(String[] args) {
		
		Student 철 = new Student();//객체생성
		철.나이 = 50;
		철.이름 = "김대철";
		철.전화번호 = "010-3380-6423";
		철.info();
		
		Student 가은 = new Student();//다른객체생성
		가은.나이 = 22;
		가은.이름 = "김가은";
		가은.전화번호 = "010-1234-1234";
		가은.info();
		
	}

	
}
class Student{ // 클래스명 첫글자 = 대문자 , 변수 및 함수는 소문자
	String 이름;
	int 나이;
	String 전화번호;
	
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
