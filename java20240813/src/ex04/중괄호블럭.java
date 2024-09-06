package ex04;

import java.util.Scanner;

/*
 * 이클립스 단축키
 * 줄복사 : Ctrl + Alt + 상,하 방향키
 * 줄삭제 : Ctrl + d
 * 줄이동 : alt + 방향키 (상, 하)
 * 창분할 : Ctrl + Shift + [(토클기능)]
 * 
 * 화면확대 : Ctrl + M
 * 윈도우키 + shift + S --> 캡쳐가능
 */
public class 중괄호블럭 {

	public static void main(String[] args) {
		
		int n = 100;
		n = 200;

		
		{
			//블럭 안 내용은 블럭 내에서만 사용 가능***
			int num = 10;
			System.out.println(num);
		}
		{
			int num2 = 20;
			System.out.println(num2);
		}
		{
			int num2 = 30;
			System.out.println(num2);
		}
		
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine(); // 아무거나 입력 가능
		System.out.println(line);
		
		int number = sc.nextInt(); // 정수만 입력가능
		System.out.println(number);
		

	}

}
