package ex02;

public class AddFunc2 {

	public static void main(String[] args) {

		//정수 값 10 넘겨주면 함수에서 1~10까지 합구해서 리턴시킨다.
		
		int result = func(10);

		System.out.println(result);

		}
	
		static int func(int num) {
		
		int sum = 0;
		for(int i = 0; i<=num; i++)
			sum += i;
		
		return sum;
		
			
			

	}

}
