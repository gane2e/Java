package ex06;

/*
 * 짝수 홀수 판별.람다식
 */

import java.util.function.Predicate;

public class Exam04 {

	public static void main(String[] args) {
		
		
		
		Predicate<Integer> predicate = (num) -> (num%2==0) ? true : false; 
		
		//////
		
		Predicate<Integer> predicate2 = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				return (t%2==0) ? true : false; 
			}
		};
		
	    //////출력문
		
		int num=10;
		
		if (predicate2.test(num) ) {
			System.out.println("짝수!");
		} else {
			System.out.println("홀수");
		}
		
	}

}
