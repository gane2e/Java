package ex07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaPractice {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
		
		//1.짝수만 필터링
		List<Integer> evenNumbers = filterEvenNumbers(numbers, num -> num%2 ==0);
		for(int i : evenNumbers)
			System.out.print(i + " ");
		
		System.out.println("\n------------------------------------------------");
		
		//2.짝수의 제곱 구하기
		List<Integer> squaredNumners = map(numbers,  num -> num*num*num) ;
		for(int i : squaredNumners)
			System.out.print(i + " ");
		
		System.out.print("\n------------------------------------------------");

		
		//3.결과 출력
		System.out.println();
		forEach(numbers, num -> System.out.print(num + " "));
	}
	
	
    // 짝수만 필터링하는 메소드
    public static List<Integer> filterEvenNumbers(List<Integer> numbers, Predicate<Integer> predicate) {
    	
    	List<Integer> list = new ArrayList<>();
    	
    	for(int n : numbers) {
    		if(predicate.test(n)) {
    			list.add(n);
    		}
    	}
    	return list;
	}
    	
    // 숫자를 제곱하는 메소드
    public static List<Integer> map(List<Integer> numbers, Function<Integer, Integer> function) {
    
    	List<Integer> list = new ArrayList<>();
    	
    	for(int i : numbers) {
    			list.add(function.apply(i));
    	}
    	return list;
    	
    	
    }
    
    // 숫자를 출력하는 메소드
    public static void forEach(List<Integer> numbers, Consumer<Integer> consumer) {
    	
    	List<Integer> list = new ArrayList<>();
    	for(int i : numbers) 
    		consumer.accept(i);
    }


		
}
