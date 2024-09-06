package ex05;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		
//		{
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("1번째 정수 입력 >>");
//			int num1 = sc.nextInt();
//			
//			System.out.println("2번째 정수 입력 >>");
//			int num2 = sc.nextInt();
//			
//			int sum = num1 + num2;
//			
//			double age = sum/2;
//					
//			System.out.println("두 수 합 : " + sum + " 두 수 평균 : " + age);
//		}
		//분리된 공간
		{
			Scanner sc = new Scanner(System.in);
			
			int count=0;
			
			System.out.println("1번째 정수 입력 >>");
			int num1 = sc.nextInt();
			count = count + 1;
			
			System.out.println("2번째 정수 입력 >>");
			int num2 = sc.nextInt();
			count = count + 1;
			
			int sum = num1 + num2;
			
			double age = (double)sum/count;
			
			// double agv = sum/count; --> 소수점 뒷자리 계산 안 됨 (정수+정수)를 더한값이라서
			// double agv = sum/(double)count; --> 하나라도 실수로 강제 행변환 해주면 소수점 뒷자리까지 출력
			// double agv = (double)sum/(double)count; 
			// double agv = (double)sum/count; 
					
			System.out.println("두 수 합 : " + sum + " 두 수 평균 : " + age);
		}
	

	}

}
