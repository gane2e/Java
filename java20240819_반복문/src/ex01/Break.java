package ex01;

public class Break {

	public static void main(String[] args) {


		//1~100 -> 100번 연산 후 5050;
		//1~10,000회전 => 1,000,000 -> 연산 횟수
		
		int i, sum, count;
		i = sum = count = 0;
		for( ; i<10000;) { //i가 1만이 되기 전까지 반복
			
			if(sum > 20) break;
			sum += i;
			
			count++; 
			i++;
		}
		
		System.out.printf("sum : %d, count : %d\n", sum, count);

	}

}
