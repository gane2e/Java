package ex02;

public class MathArrayUtils {

	
	//생성자
	private MathArrayUtils(){
		
	}
	
	 static int sum(int[] values) {
		int total = 0;
		for(int value : values) {
			total += value;
		}
		return total;
	}
//	//void가 아니면 리턴x
//	 static double avg(int[] values) {
//		 return sum(values) / values.length;
//	} 
//	 
//	 static int min(int[] values) {
//		 int min = values[0];
	 }

//	 
//}
