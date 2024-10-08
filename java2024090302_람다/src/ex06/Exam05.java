package ex06;

import java.util.function.Supplier;

/*
 * 함수 호출하면 랜덤숫자 하나 뽑기
 */

public class Exam05 {

	public static void main(String[] args) {
		
		Supplier<Integer> supplier = () -> (int)(Math.random()*100);
		
		
		
		int result = supplier.get();
		
		System.out.println(result);
	}

}
