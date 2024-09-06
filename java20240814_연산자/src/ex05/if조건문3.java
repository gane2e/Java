package ex05;

import java.util.Scanner;

public class if조건문3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력 >> ");
		
		int num = sc.nextInt();
		
		//삼항 연산자로 num >= 90 A, 80 >= B, 70 >= C, 나머지 F
		
//		String result = (num>60) ? "합격" : "불합격";
//		System.out.println(result);

		
		String result2 = "";
		
		if(num >= 90) {
			result2 = "A";
		} else if(num >= 80) {
			result2 = "B";
		} else if(num >= 70) {
			result2 = "c";
		} else {
			result2 = "F";
		}
		
		System.out.println(result2);
		
	
	}

}
