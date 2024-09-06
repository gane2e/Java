package ex02;

public class 비교연산자 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1 == num2); //같은지 검사
		System.out.println(num1 != num2); // 같지않은지 검사
		
		System.out.println(num1 > num2); //좌변이 큰지 검사
		System.out.println(num1 >= num2); //좌변이 크거나 같은지 검사
		
		System.out.println(num1 < num2); //우변이 큰지 검사
		System.out.println(num1 <= num2); //우변이 크거나 같은지 검사
	}

}
