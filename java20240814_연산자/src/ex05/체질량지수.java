package ex05;

import java.util.Scanner;

public class 체질량지수 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키를 입력하세요.");
		double m = sc.nextDouble();
		
		System.out.println("몸무게를 입력하세요.");
		double kg = sc.nextDouble();
		
		double BMI = kg / (m*m);
		String result = "";
		
		if ( BMI > 30 ) {
			result = "비만입니다.";
		}else if ( BMI > 25 ) {
			result = "과체중입니다.";
		}else if ( BMI > 18.5) {
			result = "정상 체중입니다.";
		}else{
			result = "저체중입니다.";	
		}
		
		System.out.printf("키 : %.1fm, 몸무게 : %.1fkg, BMI: %.1f\n result: %s ", m, kg, BMI , result);
	


		}
}
