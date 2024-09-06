package ex01;

public class 연습문제 {

	public static void main(String[] args) {

		
		int[] nArr = new int[5];
		
		//배열 초기화 -> 값 범위는 1~100 => 랜덤함수 이용해서
		
		 for(int i=0; i<nArr.length; i++) {
			 nArr[i] = (int)(Math.random()*100)+1;
		 }
		 for(int i=0; i<nArr.length; i++) {
		 System.out.printf("%d, " , nArr[i]);
		 }
		 
		 //max & min
		 int max, min;
		 max = min = nArr[0];
		 
		 for(int i=0; i<nArr.length; i++) {
			if(nArr[i]>max)  max = nArr[i];

			if(nArr[i]<min)  min = nArr[i];
		}
		 System.out.printf("\n최대값 : %d, 최소값 : %d\n", max, min);
		 
		//총점 & 평균
		 int sum = 0;
		 double avg = 0;
		 for(int i=0; i<nArr.length; i++) {
			 sum += nArr[i];
		 }
		 avg = (double)sum/nArr.length;
		 System.out.printf("총점 : %d, 평균 : %.2f\n", sum, avg);
		 
		 //오름차순 정렬
		 System.out.print("오름차순으로 정렬 : ");
		 for(int i=0; i<nArr.length; i++) { // 1~5회전
			 for(int j=0; j<nArr.length-1-i; j++) { //-i는 이미 비교된 값임, 써도되고 안써도됨. , j -> 0~3
				 if(nArr[j]>nArr[j+1]) {
					 int tmp = nArr[j];
					 nArr[j] = nArr[j+1];
					 nArr[j+1] = tmp;
				 }
			 }
		 }
		 for(int i=0; i<nArr.length; i++) {
			 System.out.printf("%d , ", nArr[i]);
		 }
		
	}
}




