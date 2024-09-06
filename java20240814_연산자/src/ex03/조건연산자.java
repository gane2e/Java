package ex03;

public class 조건연산자 {

	public static void main(String[] args) {
		
		// 국어점수가 70이상 합격, 아니면 불합격
		
		int kor = 65;
		
		
		String result = (kor>=70) ? "합격" : "불합격"; // (조건연산식) ? "True문자" : "Fales문자"
		// 결과를 result에 보내서 result를 출력
		
		System.out.println(result);
		
	}

}
