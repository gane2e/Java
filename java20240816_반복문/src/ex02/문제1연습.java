
//5명의 점수를 반복문으로 입력받아서 반복문으로 출력하고, 입력받은 점수 중 최대값 구하기

package ex02;

import java.util.Scanner;

public class 문제1연습 {

	public static void main(String[] args) {
		
		int[] com = new int[5];
		
		//System.out.println(com.length);
		
		Scanner sc = new Scanner(System.in);
		
		//입력
		for(int i=0; i<com.length; i++) {
			System.out.printf("%d번째 점수 입력", i+1);
			com[i] = sc.nextInt();
		}
		
		//출력
		System.out.println("출력 : ");
		for(int i=0; i<com.length; i++) {
			System.out.println(com[i] + ", ");
		}
		
		System.out.println("");//////////////
		
		//입력한 데이터 역순 출력
		System.out.println("역순출력 : ");
		for(int i=0; i<com.length; i++) {
			System.out.println(com[com.length - 1 - i] + ", ");			
		}
			
		
		
		System.out.println("");//////////////
		
		//최대값, 최소값 계산
		int max, min;
		max = 0;
		min = com[0];
		
		for(int i=0; i<com.length; i++) {
			if(com[i]>max)
				max = com[i];
			
			if(com[i]<min)
				min = com[i];
		}
		System.out.println( " 최대값 " + max + "최소값" + min);
		
	
		//총점, 평균 계산
		int sum = 0;//총점
		for(int i=0; i<com.length; i++) {
			sum += com[i];
		}
		System.out.printf( "총점 : %d, 평균 : %.2f\n", sum, (double)sum/com.length);
	}

}
