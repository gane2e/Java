package ex01;

public class Break02 {

	public static void main(String[] args) {

		for(int i=2; i<=9; i++) {
			
			for(int j=1; j<=9; j++) {
				
				System.out.printf("%d X %d = %d\n", i, j, i*j);
				
				if(i == j) break; //i와 j가 같아질 때 중단
			}
			break; // 1차반복 끝나고 바로 중단
//			System.out.println("--------------");
			
		}

	}

}
