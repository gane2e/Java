package ex08;

import java.util.Scanner;

public class 연습 {

	public static void main(String[] args) {

		System.out.println("하나의 정수를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String str = (num % 2 == 0) ?  "짝수" : "홀수";
			System.out.printf("입력한 숫자는 %d는 %s입니다.", num, str);
	

	}

}
