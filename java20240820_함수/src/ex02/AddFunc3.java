package ex02;

public class AddFunc3 {

	public static void main(String[] args) {

		//정수 값 10 넘겨주면 함수에서 1~10까지 합구해서 평균 리턴시킨다.
		
		double result = func(100);

		System.out.println(result);

		}
	
		static double func(int num) {
		
		int sum = 0;
		for(int i = 0; i<=num; i++)
			sum += i;
		
		return (double)sum/num;
		
			
			

	}

}
