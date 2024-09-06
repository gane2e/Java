package ex03;

public class 조건연산자2 {

	public static void main(String[] args) {
		
		// 국어점수가 70이고 영어점수가 70이상이면 합격, 아니면 불합격
		
		int kor = 60;
		int eng = 85;
		
		
		String result1 = ( kor >= 70 && eng >= 70 ) ? "합격" : "불합격"; // (조건연산식) ? "True문자" : "Fales문자"
		// 연산 결과를 result에 보내서 result를 출력
		
		String result2 = ( kor == 70 || eng >= 70 ) ? "합격" : "불합격"; // (조건연산식) ? "True문자" : "Fales문자"
		// 연산 결과를 result에 보내서 result를 출력
		
		System.out.println(result1);
		System.out.println(result2);
		
	}

}
