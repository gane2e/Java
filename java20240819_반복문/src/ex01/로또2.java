package ex01;

import java.util.Random;

public class 로또2 {

	public static void main(String[] args) {
		//로또 -> 5게임
		
		int[] lotto = new int[6];
		
//		System.out.println((int)(Math.random()*45)+1);
		//(random.nextInt(45)+1);

		Random random = new Random();
				
		for(int i=0; i<5; i++) {//줄개수
			
			for(int j=0; j<6; j++) { //열개수
				int tmp = random.nextInt(45)+1; //랜덤값 뽑아서 -> tmp에 임시저장
				boolean flag = false; //flag = 기본값 false
				
				for(int k=0; k<j; k++) 
				{ //배열 숫자
					System.out.println( j + " , " + k);
					if (lotto[k] == tmp)
					{
						flag = true;//초기화
						j--;//중복이면 이 조건 실행하지 않은걸로 ,, j-- back시킴
						break;
					}
				}
				
				
				if(flag == false ) {
					lotto[j] = tmp;
					//System.out.print(lotto[j] + ", ");
				}
			}
			System.out.println();			
		}
		
	}

}
