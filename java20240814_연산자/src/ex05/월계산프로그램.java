package ex05;

import java.util.Scanner;

public class 월계산프로그램 {

	public static void main(String[] args) {
		
		System.out.println("월을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String result3 = "";
		
		//|| &&
		
		if (num == 1 || num == 12 || num == 2) { 
			result3 = "겨울";
//		} else if (num == 3 || num == 4 || num == 5) {
		} else if (num >= 3 && num <= 5 ) {
			result3 = "봄";
		} else if (num == 6 || num == 7 || num == 8){
			result3 = "여름";
		} else if (num == 9 || num == 10 || num == 11) {
			result3 = "가을";
		} else {
			System.out.println("1~12사이의 숫자만 입력하세요.");
		}
		if(num <= 12)
		System.out.println( num + "월은 " + result3 + " 입니다.");

	}

}
