
//5명의 점수를 반복문으로 입력받아서 반복문으로 출력하고, 입력받은 점수 중 최대값 구하기

package ex02;

import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		
		int[] com = new int[5];//int 크기 5명 방 생성
		Scanner sc = new Scanner(System.in);
		
		//입력
		for(int i=0; i<5; i++) { //i가 조건식에 해당하지 않을 때가지 아래 코드를 실행 후 i에 1을 추가함
			System.out.printf("%d번째 학생 점수 입력", i+1); //이동한 i값에 1더해 문자출력
			com[i] = sc.nextInt(); //입력 한 내용을  i 공간에 할당함
		}
		//출력
		System.out.println("출력 : ");
		for(int i=0; i<5; i++) {
			System.out.println(com[i] + " ,");
		}
		
		//입력한 데이터 역순 출력
		System.out.println("역순출력 : ");
		for(int i=0; i<com.length; i++) {
			System.out.println(com[com.length - 1 - i] + ", ");			
		}
		
		//최대값 구하기	
		int max = 0; // 최대값 변수 생성
		
		for(int i=0; i<5; i++) { //i가 조건식에 해당하지 않을 때가지 아래 코드를 실행 후 i에 1을 추가함
			if (com[i] > max) //com변수에 입력받은 i번째 값이 max보다 크면 아래 코드를 실행함
				//max는 처음에 0이라고 선언함
			max = com[i]; // 위 조건식에 true인 값이 max에 할당함. 
			//com[i]의 값을 체크 후 max보다 큰 com[i]값이 max에 저장됨
		}
		
		System.out.println("최대값 : " + max);
		
		
		//총점 구하기
		int sum = 0;
		
		for(int i=0; i<5; i++) { //i가 조건식에 해당하지 않을 때가지 아래 코드를 실행 후 i에 1을 추가함
			sum += com[i];
		}
		
		System.out.println("총점 : " + sum);
		
		//평균 구하기
		
		double avg = sum/5.0;
		System.out.printf("평균 : %.2f\n", avg);
		
		//정렬
		for(int i=0; i<com.length; i++) {
			
			for(int j=0; j<com.length-1-i; j++) { //마지막 수는 조건체크할 필요 없기때문에 -1해서 계산함
				if(com[j] > com[j+1]) {
					int tmp = com[j];
					com[j] = com[j+1];
					com[j+1]=tmp;
				}
			}
		}

		System.out.print("출력 : ");
		for(int i=0; i<com.length; i++) {
			System.out.print(com[i] + " , ");
		}
		
	}

}
