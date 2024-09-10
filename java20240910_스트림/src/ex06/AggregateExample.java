package ex06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AggregateExample {

	public static void main(String[] args) {
		
		//정수 배열
		int[] arr = { 1,2,3,4,5 };
		
		//카운팅
		long count = Arrays.stream(arr)
				.filter(n -> n%2==0)
				.count();
		System.out.println("2의 배수 개수: " + count);
		
		//총합
		long sum = Arrays.stream(arr)
				.filter(n -> n%2==0)
				.sum();
		System.out.println("2의 배수의 합: " + sum);
		
		/*
		 * DoubleStream 인터페이스의 average()는 리턴값이 OptionalDouble이다.
		 * OptionalDouble 객체의 값을 double 로 가져오기 위해서는 getAsDouble()를 사용해야 한다.
		 */
		
		//평균
		OptionalDouble avg = Arrays.stream(arr)
				.filter(n -> n%2==0)
				.average();
		System.out.println("2의 배수의 평균: " + avg.isEmpty());
		System.out.println("2의 배수의 평균: " + avg.isPresent());
		
		if(avg.isPresent())
			System.out.println(avg.getAsDouble());
		else
			System.out.println(avg.orElse(0.0));
		/*
		//최대값
		int max = Arrays.stream(arr)
				.filter(n -> n%2==0)
				.max()
				.getAsInt();
		System.out.println("최대값: " + max);
		
		//최소값
		int min = Arrays.stream(arr)
				.filter(n -> n%2==0)
				.min()
				.getAsInt();
		System.out.println("최소값: " + min);
		
		//첫 번째 요소
		int first = Arrays.stream(arr)
				.filter(n -> n%3==0)
				.findFirst()
				.getAsInt();
		System.out.println("첫 번째 3의 배수: " + first);
		*/
		
	}
}
