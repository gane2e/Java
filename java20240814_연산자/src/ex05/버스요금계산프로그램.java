package ex05;

import java.util.Scanner;

public class 버스요금계산프로그램 {

	public static void main(String[] args) {
//		0~0.99
//		0.5 *100 =50
//		
//		1~100
		
		int age = (int)(Math.random()*100)+1;
		
		int fee = 2000;
		double rate = 0;

		if ( age >= 65 || age <= 5 ) { 
			rate = 0;
			}else if ( age >= 19 ) {
				rate = 1;
			}else if ( age >= 13 ) {
				rate = 0.75;
			}else if ( age >= 6 ) {
				rate = 0.5;
			}
		
		int result = (int)(fee * rate);
		System.out.printf("나이 : %d, 버스 요금 : %d원\n", age, result);
		}
}
