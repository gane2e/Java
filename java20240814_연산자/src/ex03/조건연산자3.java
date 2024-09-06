package ex03;

public class 조건연산자3 {

	public static void main(String[] args) {
		
		// 국어점수가 80 이상이면 우수 , 60 이상이면 보통, 60이하면 분발
		
		//경우의수가 2가지일 경우에 사용하기 좋음. 그이상의 조건이면 if문사용 권장
		
		int kor = 40;
		
		
		String result1 = ( kor >= 80 ) ? "우수" : ( kor >= 60 ) ? "보통" : "분발" ; // (조건연산식) ? "True문자" : (Fales조건연산) "True문자" : "Fales문자"
		// 연산 결과를 result1에 보내서 result1을 출력
		
	
		System.out.println(result1);
		
		
		
	}

}
