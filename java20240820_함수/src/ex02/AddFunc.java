package ex02;

public class AddFunc {

	public static void main(String[] args) {


		int[] arr = add(10, "abc", 20); // 10, 20 -> 인자
		int sum = 0;
		
		for(int i= 0; i<arr.length; i++)
			sum += arr[i];
		
		System.out.println("sum : " + sum);

		}
	
	static int[] add(int num1, String str1, int num2) {//(int num,1 ~ ) -> 매개변수
		
		int[] nArr = {1,2,3,4,5};
		
		return nArr;//위 값을 리턴해줌, 리턴값과 메소드명, 타입 일치해야함

	}

}
