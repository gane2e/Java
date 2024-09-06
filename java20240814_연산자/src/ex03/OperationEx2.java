package ex03;

import java.util.Scanner;

public class OperationEx2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("초를 입력하세요.");
		int time = sc.nextInt();
		
		//1시간은 3600초
		//1분은 60초
		
		int h , m ,s;
		
		h = time / 3600;
		m = (time % 3600) / 60;
		s = time % 60;
		//1시간 400초
		//400 분으로ㅓ 바꾸기 6분
		
		System.out.printf("%d시간 %d분 %d초", h, m, s);
		/*
		 * //시간 int hour = num / 3600; int remainingSeconds = num % 3600;
		 * 
		 * //분 int minute = 400 / 60; remainingSeconds = 400 % 60;
		 * 
		 * 
		 * System.out.printf("%d시간 %d분 %d초", hour, minute, remainingSeconds);
		 */
		

	}

}
