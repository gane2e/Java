
//5명의 점수를 반복문으로 입력받아서 반복문으로 출력하고, 입력받은 점수 중 최대값 구하기

package ex02;

import java.util.Scanner;

public class 문제1연습2 {

	public static void main(String[] args) {
		
		int[] com = new int[5];
		Scanner sc = new Scanner(System.in);
		
		
		//System.out.println(com.length);
	
		
		//입력
		for(int i=0; i<5; i++) {//꺽새 잘못표시하면 출력 안함
			System.out.printf("%d번째 학생 점수 입력", i+1);
			com[i] = sc.nextInt();
		}
		
		//출력
		System.out.println("출력 : ");
		for(int i=0; i<5; i++) {
			System.out.print(com[i] + ",");
		}

		System.out.println("-------------------");
		
		//입력한 데이터 역순 출력
		System.out.println("역순출력 : ");
		for(int i=0; i<5; i++) {
			System.out.println(com[com.length - 1 - i] + ",");
		}
			
		System.out.println("-------------------");
		//최대값, 최소값 계산	
		
		int max = 0;
		
		for(int i=0; i<5; i++) {
			if (com[i] > max)
				max = com[i];
		}
		System.out.println("최대값 : " + max);
		
		
		System.out.println("-------------------");
		
		int min = com[0];
		
		for(int i=0; i>5; i++) {
			if(com[i] < min)
				min = com[i];
		} 
		System.out.println("최소값 : " + min);

		System.out.println("-------------------");
		
		//총점, 평균 계산
		
		int sum = 0;
		for(int i=0; i<5; i++) {
			sum += com[i];
		}
		System.out.println("총점 : " + sum);
		
		System.out.println("-------------------");
		
		double avg = 0;
		avg = sum/(double)com.length;
		System.out.printf("평균: %.2f점\n", avg);
		
		System.out.println("-------------------");
		
		
		//값이 큰 순서대로 정렬(2중포문)
		
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<5-1-i; j++) {
				if(com[j] > com[j+1]) {
					int tmp = com[j];
					com[j] = com[j+1];
					com[j+1] = tmp;
				}
			}
		}
		
		System.out.print("출력 : ");
		for(int i=0; i<com.length; i++) {
			System.out.print(com[i] + " , ");
		}
		
	}

}
