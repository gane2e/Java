package ex01;

public class Continue2 {

	public static void main(String[] args) {

		//0~10 짝수 합 구하기
		
		int sum = 0;
		for(int i=2; i<=10; i+=2)
			sum += i;
		System.out.println(sum);


		sum=0;
		for(int i=1; 1<=10; i++) {
			if(i % 2 == 1) continue; //아래 식 실행하지 않음
			sum += i;
		}
//		System.out.println(sum);//?????
	}

}
