package ex02;

public class 산술연산자 {

	public static void main(String[] args) {
		
		int num1 = 8;
		int num2 = 7;
		
		int 더하기 = num1 + num2;
		int 빼기 = num1 - num2;
		int 곱하기 = num1 * num2;
		double 나누기 = num1 / (double)num2; // int로 받을 땐 정수로받아 정수로 출력하기 위해 1로출력함, 소수점 계산 위해서는 강제행변환하고 변수를 double로 변경
		int 나머지 = num1 % num2; //num1을 num2로 나눈 나머지
		
		System.out.println(더하기);
		System.out.println(빼기);
		System.out.println(곱하기);
		System.out.println(나누기);
		
		//printf : 어떠한 형식을 지정하여 표출함 (%# , ~)
		// 한줄로 출력하기 편함
		System.out.printf("%d/n" , 곱하기);  //%d 십진 정수
		System.out.printf("%x\n" , 곱하기);  //%d 16진수 출력
		System.out.printf("%o\n" , 곱하기);  //%d 8진수 출력
		
		System.out.printf("%f\n" , 나누기);  //%f 실수 출력
		System.out.printf("%.3f\n" , 나누기);  //%f 실수 출력 , .3= 소수점 3째자리까지 표출함
		
		System.out.println(나머지);
		System.out.println("---------------");
		
		int num3 = 12;
		int num4 = 123;
		int num5 = 1234;
		int num6 = 12345;
		System.out.println(num3 + " , " + num3);
		System.out.println(num4 + " , " + num4);
		System.out.println(num5 + " , " + num5);
		System.out.println(num6 + " , " + num6);
		
		System.out.println("---------------");

		System.out.printf("%d , %d\n", num3, num3);
		System.out.printf("%d , %d\n", num4, num4);
		System.out.printf("%d , %d\n", num5, num5);
		System.out.printf("%d , %d\n", num6, num6);

		System.out.println("---------------");

		System.out.printf("%5d , %5d\n", num3, num3);// +는 우측부터 채움 (숫자는 채우고 n칸 띄움)
		System.out.printf("%5d , %5d\n", num4, num4);
		System.out.printf("%5d , %5d\n", num5, num5);
		System.out.printf("%5d , %5d\n", num6, num6);
		
		System.out.println("---------------");

		System.out.printf("%-10d , %5d\n", num3, num3); // -는 좌측부터 채움 (숫자는 채우고 n칸 띄움)
		System.out.printf("%-5d , %5d\n", num4, num4);
		System.out.printf("%-5d , %5d\n", num5, num5);
		System.out.printf("%-5d , %5d\n", num6, num6);
		
		
				
	}

}
