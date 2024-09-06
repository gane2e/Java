package ex01;

import java.util.Scanner;

/*
 * 나이하고 이름을 키보드 통해서 입력 받아서
 * 출력
 */
public class InputNameAge {

	public static void main(String[] args) {
		/* 기본자료형
		 * 정수형
		 * > byte. short, int, long
		 * 실수형
		 * > float, double
		 * 논리형
		 * > boolean
		 * 문자형
		 * > char
		 */
		
		Scanner sc = new Scanner(System.in);
		/*  Scanner : 자료형
		 *  sc : 변수(참조형은 메모리공간에 주소값을 넣음)	
		 *  키보드로 값을 입력받을 때 써야함
		 */
		
		System.out.println("이름을 입력하세요 : ");
		String a = sc.nextLine(); //String운 기본자료형이 아니므로 참조자료형 문자열 입력받을 때 사용
		System.out.println("나의 이름은 " + a + " 입니다."); //a라는 값과 문장을 분리
		
		
		System.out.println("나이를 입력하세요 : ");
		int b = sc.nextInt(); //정수를 입력 받기위해 int 사용
		System.out.println("나이는 " + b + " 입니다.");

		
		System.out.println("프로그램 종료!");
	
		

	}

}
