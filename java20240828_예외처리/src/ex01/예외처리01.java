package ex01;

import java.util.Scanner;

public class 예외처리01 {

	public static void main(String[] args) {
		
		/*
		 * 예외처리 안되어있는 코드
		 */
		
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수 입력");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		//num == 0이면 프로그램 중단
		double result = 0;
		result = num1 / num2;
		
		System.out.println("두 수 나눈 결과는 "  + result);
		
		System.out.println("프로그램 종료");
		
	}

}
