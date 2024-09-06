package ex05;

import java.util.Scanner;

public class 주차요금계산프로그램 {

	public static void main(String[] args) {
		
		double hours = (double)(Math.random()*5)+0.1;
		
		int fee = 1000;
		double rate = 0;
		
		if ( hours >= 0 && hours <= 1 ) { 
			rate = 1;
			}else if (hours > 3 ) {
				rate = 5;
			}else if (hours >= 2 ) {
				rate = 3;
			}else if (hours >= 1 ) {
				rate = 2; 
			}
		
		int result = (int)(fee * rate);
		System.out.printf("주차시간 : %.1f시간, 주차요금 : %d원\n", hours, result);
		}
}
