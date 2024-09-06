
//문제 : 양의 정수를 입력받아서 1부터 n까지 홀수합 구하기

package ex01;

import java.util.Scanner;

public class ForEx02 {

	public static void main(String[] args) {

		System.out.println("양수를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			if(i % 2 == 1)
				sum += i;
		}
		
		if(n<0) {
			System.out.println("음수는 입력할 수 없습니다.");
		} else if (n>0) {
			System.out.printf("입력값 : %d, 홀수합계 : %d", n, sum);
		}
	
		
	}

}
