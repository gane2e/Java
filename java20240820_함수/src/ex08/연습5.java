package ex08;

import java.util.Scanner;

public class 연습5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2 ;
		int result = 0;
		int tmp = 0;
	
		System.out.println("첫 번째 숫자를 입력하세요 : ");
		num1 = sc.nextInt();
		
		System.out.println("두 번째 숫자를 입력하세요 : ");
		num2 = sc.nextInt();
		

		if(num1>num2) {
			tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		
		for(int i=num1; num1<=num2; num1++) {
			result = num1;
			System.out.printf("%d ,", result);
		}
		
	

	}

}
